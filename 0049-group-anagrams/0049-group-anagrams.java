class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s : strs){
            char[] letters = s.toCharArray();
            Arrays.sort(letters);
            String sorted = new String(letters);
            if(map.get(sorted) == null){
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(s);
                map.put(sorted, temp);
            }
            else {
                map.get(sorted).add(s);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for(String s : map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }
}