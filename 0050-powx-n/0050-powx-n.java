class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
        // if(n == 0) {
        //     return 1.0;
        // }
        // boolean positive = true;
        // if(n < 0) {
        //     positive = false;
        //     n = Math.abs(n);
        // }
        // double result = 1.0;
        // for(int i = 0; i < n; i++) {
        //     result = result * x;
        // }
        // if(positive) {
        //     return result;
        // }
        // else {
        //     return (double) 1 / result;
        // }
    }
}