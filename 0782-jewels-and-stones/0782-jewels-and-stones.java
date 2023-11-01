class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int s = stones.length();
        int count = 0;
        for(int i = 0; i < s; i++){
            if(jewels.indexOf(stones.charAt(i)) != -1){
                count += 1;
            }
        }
        return count;
    }
}