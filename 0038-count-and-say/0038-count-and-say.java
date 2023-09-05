class Solution {
    public String countAndSay(int n) {
        String curr = "1";
        for (int i = 2; i <= n; i++) {
            curr = convert(curr);
        }
        return curr; // You need to return the final result here
    }

    public String convert(String prev) {
        int s = prev.length();
        int count = 1;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s; i++) {
            if (i == s - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
                res.append(count);
                res.append(prev.charAt(i));
                count = 1;
            } else {
                count++;
            }
        }
        return res.toString();
    }
}