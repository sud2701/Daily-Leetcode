class Solution {
    public int minPartitions(String n) {
     int len = n.length();
     int max = 0;
     char ch;
     for(int i = 0; i < len; i++){
         ch = n.charAt(i);
         if(Character.getNumericValue(ch) > max){
             max = Character.getNumericValue(ch);
         }
     }
     return max;   
    }
}