class Solution {
    public double averageWaitingTime(int[][] customers) {
        // Arrays.sort(customers, new SortByTime());
        int time = 1;
        double total_wait = 0;
        for(int[] i: customers) {
            if(i[0] > time) {
                time = i[0];
            }
            time += i[1];
            total_wait += (time - i[0]);
        }
        return (double) total_wait / customers.length;
    }
}

// class SortByTime implements Comparator<Integer[]> {
//     public int compare(int[] a, int[] b) {
//         if(a[0] == b[0]) {
//             return a[1] - b[1];
//         }
//         return a[0] - b[0];
//     }
// }