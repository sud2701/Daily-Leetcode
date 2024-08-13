class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, (a, b) -> b - a);
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(count < k){
                    maxHeap.add(matrix[i][j]);
                    count++;
                }
                else {
                    if(matrix[i][j] < maxHeap.peek()){
                        maxHeap.poll();
                        maxHeap.add(matrix[i][j]);
                    }
                }
            }
        }
        return maxHeap.poll();
    }
}