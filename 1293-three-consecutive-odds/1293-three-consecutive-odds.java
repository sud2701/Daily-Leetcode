class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd_count = 0;
        for(int i: arr) {
            if(i % 2 == 1) {
                odd_count += 1;
                if(odd_count == 3){
                    return true;
                }
            }
            else {
                odd_count = 0;
            }
        }
        return false;
    }
}