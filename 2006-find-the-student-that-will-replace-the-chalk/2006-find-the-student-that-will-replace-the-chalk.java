class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total_chalk = 0;
        for(int i : chalk) {
            total_chalk += i;
        }
        int rem = (int)(k % total_chalk);
        int index = 0;
        for(int i : chalk) {
            if(rem < i){
                break;
            }
            else {
                rem -= i;
                index++;
            }
        }
        return index;
    }
}