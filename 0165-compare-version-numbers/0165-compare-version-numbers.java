class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> rev1 = getCount(version1);
        ArrayList<Integer> rev2 = getCount(version2);
        int i = 0;
        while(i < rev1.size() && i < rev2.size()){
            if(rev1.get(i) > rev2.get(i)){
                return 1;
            }
            else if(rev1.get(i) < rev2.get(i)){
                return -1;
            }
            else {
               i++; 
            }
        }
        if(i == rev1.size()){
            while(i < rev2.size()){
                if(rev2.get(i) != 0){
                    return -1;
                }
                i++;
            }
        }
        else {
            while(i < rev1.size()){
                if(rev1.get(i) != 0){
                    return 1;
                }
                i++;
            }
        }
        return 0;
    }

    public ArrayList<Integer> getCount(String s){
        ArrayList<Integer> revisions = new ArrayList<Integer>();
        int curr = 0;
        char ch;
        int len = s.length();
        for(int i = 0; i < len; i++){
            ch = s.charAt(i);
            if(i == len - 1){
                if(ch != '.') {
                    curr = curr * 10 + Character.getNumericValue(ch);  
                }
                revisions.add(curr);
                break;
            }
            if(ch == '.'){
                revisions.add(curr);
                curr = 0;
            }
            else if(ch == '0' && curr > 0){
                    curr = curr * 10 + Character.getNumericValue(ch);
            }
            else {
                curr = curr * 10 + Character.getNumericValue(ch);
            }
        }
        return revisions;
    }
}