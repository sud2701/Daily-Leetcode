class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n == 0){
            return arr;
        }
        int[] copy = new int[n];
        for(int i = 0; i < n; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(copy[0], 1);
        for(int i = 1; i < n; i++){
            if(copy[i] == copy[i - 1]){
                continue;
            }
            else {
                rank += 1;
                map.put(copy[i], rank);
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}