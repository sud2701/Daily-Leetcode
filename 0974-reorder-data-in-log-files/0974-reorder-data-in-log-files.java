class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> digit_logs = new ArrayList<String>();
        ArrayList<String> letter_logs = new ArrayList<String>();
        int temp = 0;
        int i = 0;
        for(String s: logs){
            temp = s.length();
            for(i = 0; i < temp; i++){
                if(s.charAt(i) != ' ')
                    continue;
                else {
                    if(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')
                        digit_logs.add(s);
                    else
                        letter_logs.add(s);
                    break;
                }
            }
        }
        Collections.sort(letter_logs, new Compare());
        String[] ans = new String[logs.length];
        i = 0;
        Iterator ib = letter_logs.iterator();
        while(ib.hasNext()){
            ans[i] = (String)ib.next();
            i++;
        }
        ib = digit_logs.iterator();
        while(ib.hasNext()){
            ans[i] = (String)ib.next();
            i++;
        }
        return ans;
    }
}

class Compare implements Comparator<String> {
    public int compare(String a, String b) {
        int space_1 = a.indexOf(' ');
        int space_2 = b.indexOf(' ');
        String id1 = a.substring(0, space_1);
        String id2 = b.substring(0, space_2);
        String content_1 = a.substring(space_1);
        String content_2 = b.substring(space_2);
        if(content_1.equals(content_2)){
            return id1.compareTo(id2);
        }
        else {
            return content_1.compareTo(content_2);
        }
    }
}