class Solution {
    public int minOperations(String[] logs) {
        int size = 0;
        for(String s: logs) {
            if(s.equals("./")){
                continue;
            }
            else if(s.equals("../")){
                if(size > 0) {
                    size -= 1;
                }
            }
            else {
                size += 1;
            }
        }
        return size;
    }
}