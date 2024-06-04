class Solution {
    public boolean divisorGame(int n) {
        boolean flag = true;
        int i = 0;
        while(n != 1){
            for(i = 1; i < n; i++){
                if(n % i == 0){
                    n -= i;
                    break;
                }
            }
            flag = !flag;
        }
        return !flag;
    }
}