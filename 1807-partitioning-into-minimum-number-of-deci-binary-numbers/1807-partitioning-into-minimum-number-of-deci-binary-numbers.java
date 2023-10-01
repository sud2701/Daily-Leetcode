class Solution {
    public int minPartitions(String n) {
     int len = n.length();
     int max = 0;
     int ch;
     for(int i = 0; i < len; i++){
         ch = Character.getNumericValue(n.charAt(i));
         if(ch == 9){
             return 9;
         }
         if(ch > max){
             max = ch;
         }
     }
     return max;   
    }
}