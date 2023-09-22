class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder();
        int n = address.length();
        for(int i = 0; i < n; i++){
            if(address.charAt(i) == '.'){
                defanged.append("[.]");
            }
            else {
                defanged.append(String.valueOf(address.charAt(i)));
            }
        }
        return defanged.toString();
    }
}