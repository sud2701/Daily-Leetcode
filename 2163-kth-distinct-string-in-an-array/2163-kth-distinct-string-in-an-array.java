class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(int i = 0; i < n; i++) {
            if(map.get(arr[i]) > 1){
                continue;
            }
            else {
                count++;
                if(count == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}