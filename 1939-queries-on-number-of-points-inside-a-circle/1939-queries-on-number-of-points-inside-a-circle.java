class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        double dist = 0;
        int[] answer = new int[queries.length];
        int x = 0;
        for(int[] j: queries) {
            for(int[] i: points) {
                dist = Math.sqrt((i[0] - j[0]) * (i[0] - j[0]) + (i[1] - j[1]) * (i[1] - j[1]));
                if(dist <= j[2]){
                    answer[x]++;
                }
            }
            x++;
        }
        return answer;
    }
}