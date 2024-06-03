class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<Integer> ();
        int n = nums.length;
        int[] frequency = new int[n + 1];
        for(int i : nums) {
            frequency[i]++;
            if(frequency[i] > 1) {
                duplicates.add(i);
            }
        }
        return duplicates;
    }
}