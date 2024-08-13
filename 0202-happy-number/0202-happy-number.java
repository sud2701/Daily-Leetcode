class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        int temp = 0;
        while(true){
            temp = 0;
            while(n > 0){
                temp = temp + (n % 10) * (n % 10);
                n /= 10;
            }
            n = temp;
            if(n == 1){
                break;
            }
            else if(!set.add(n)){
                return false;
            }
        }
        return true;
    }
}