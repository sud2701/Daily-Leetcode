class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int count = 0;
        int n = operations.length;
        int result = 0;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            if(operations[i].equals("C")){
                    result -= scores.get(count - 1);
                    scores.remove(count - 1);
                    count -= 1;
            }
            else if(operations[i].equals("D")){
                    if(count > 0){
                        temp = 2 * scores.get(count - 1);
                        result += temp;
                        scores.add(temp);
                        count++;
                    }
                }
            else if(operations[i].equals("+")){
                temp = scores.get(count - 1) + scores.get(count - 2);
                result += temp;
                scores.add(temp);
                count++;
            }
            else {
                scores.add(Integer.parseInt(operations[i]));
                count++;
                result += Integer.parseInt(operations[i]);
            }
        }
        return result;
    }
}