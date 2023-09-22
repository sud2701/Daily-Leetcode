class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder repeated = new StringBuilder(word);
        int count = 1;
        while(true){
            if(sequence.contains(repeated.toString())){
                count += 1;
                repeated.append(word);
            }
            else {
                break;
            }
        }
        return count - 1;
    }
}