class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String s = s1.trim() + " " + s2.trim();
        String[] words = s.split(" ");
        for(String word : words) {
            if(map.get(word) == null){
                map.put(word, 1);
            }
            else {
                map.put(word, map.get(word) + 1);
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        for(String word: map.keySet()){
            if(map.get(word) == 1){
                result.add(word);
            }
        }
        String[] final_res = new String[result.size()];
        Iterator<String> ib = result.iterator();
        int i = 0;
        while(ib.hasNext()){
            final_res[i] = ib.next();
            i++;
        }
        return final_res;
    }
}