class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a, b) -> a - b);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            minHeap.add(i);
        }
        int n = arr.length;
        int[] result = new int[n];
        int rank = 1;
        int temp = 0;
        int count = 0;
        while(count < n){
            temp = minHeap.poll();
            count++;
            if(map.get(temp) == null){
                map.put(temp, rank);
                rank++;
            }
        }
        for(int i = 0; i < n; i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}