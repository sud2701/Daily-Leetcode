class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        if(k == 1){
            return true;
        }
        int[] freqs = new int[k];
        int temp = 0;
        int i = 0;
        for(i = 0; i < n; i++){
            temp = arr[i] % k;
            if(temp < 0){
                temp = k - Math.abs(temp);
            }
            freqs[temp]++;
        }
        if(freqs[0] % 2 != 0){
            return false;
        }
        for(i = 1; i < k / 2; i++){
            if(freqs[i] != freqs[k - i]){
                return false;
            }
        }
        if(k % 2 == 0 && freqs[i] % 2 == 0){
            return true;
        }
        else if(k % 2 != 0 && freqs[i] == freqs[k - i]){
            return true;
        }
        else {
            return false;
        }
    }
}