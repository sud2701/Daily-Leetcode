class Solution {
    public int findComplement(int num) {
        int maxBin = 1;
        while(maxBin - 1 < num){
            maxBin *= 2;
        }
        return (maxBin - 1) ^ num;
    }
}