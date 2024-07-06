class Solution {
    public int passThePillow(int n, int time) {
        boolean flag = true;
        while(time > n - 1) {
            time = time - n + 1;
            flag = !flag;
        }
        if(flag) {
            return time + 1;
        }
        else {
            return n - time;
        }
    }
}