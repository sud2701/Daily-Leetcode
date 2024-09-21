class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>(n);
        for(int i = 1; i <= n; i++){
            result.add(i);
        }
        Collections.sort(result, new Compare());
        return result;
    }
}

class Compare implements Comparator<Integer> {
    String sa;
    String sb;
    int len_a;
    int len_b;
    public int compare(Integer a, Integer b){
        sa = String.valueOf(a);
        sb = String.valueOf(b);
        len_a = sa.length();
        len_b = sb.length();
        int i = 0;
        while(i < len_a && i < len_b){
            if(sa.charAt(i) == sb.charAt(i)){
                i++;
            }
            else {
                return sa.charAt(i) - sb.charAt(i);
            }
        }
        if(i == len_a){
            return -1;
        }
        else {
            return 1;
        }
    }
}