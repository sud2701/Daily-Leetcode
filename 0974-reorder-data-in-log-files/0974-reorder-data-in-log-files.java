class Solution {
    public String[] reorderLogFiles(String[] logs) {
        // ArrayList<String> digit_logs = new ArrayList<String>();
        // ArrayList<String> letter_logs = new ArrayList<String>();
        // int temp = 0;
        // int i = 0;
        // for(String s: logs){
        //     temp = s.length();
        //     for(i = 0; i < temp; i++){
        //         if(s.charAt(i) != ' ')
        //             continue;
        //         else {
        //             if(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')
        //                 digit_logs.add(s);
        //             else
        //                 letter_logs.add(s);
        //             break;
        //         }
        //     }
        // }
        // Collections.sort(letter_logs, new Compare());
        // String[] ans = new String[logs.length];
        // i = 0;
        // Iterator ib = letter_logs.iterator();
        // while(ib.hasNext()){
        //     ans[i] = (String)ib.next();
        //     i++;
        // }
        // ib = digit_logs.iterator();
        // while(ib.hasNext()){
        //     ans[i] = (String)ib.next();
        //     i++;
        // }
        // return ans;
        Arrays.sort(logs, new Compare());
        return logs;
    }
}

class Compare implements Comparator<String> {
    int space_1;
    int space_2;
    String id1;
    String id2;
    String content_1;
    String content_2;
    public int compare(String a, String b) {
        space_1 = a.indexOf(' ');
        space_2 = b.indexOf(' ');
        if(a.charAt(space_1 + 1) <= '9'){
            if(b.charAt(space_2 + 1) <= '9'){
                return 0;
            }
            else return 1;
        }
        else {
            if(b.charAt(space_2 + 1) <= '9'){
                return -1;
            }
        }
        id1 = a.substring(0, space_1);
        id2 = b.substring(0, space_2);
        content_1 = a.substring(space_1);
        content_2 = b.substring(space_2);
        if(content_1.equals(content_2)){
            return id1.compareTo(id2);
        }
        else {
            return content_1.compareTo(content_2);
        }
    }
}