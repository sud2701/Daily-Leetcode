class Solution {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        int temp = 0;
        int multiplier = 1;
        StringBuilder result = new StringBuilder();
        HashMap<Integer, String> words = new HashMap<Integer, String>();
        words.put(1, "One ");words.put(2, "Two ");words.put(3, "Three ");
        words.put(4, "Four ");words.put(5, "Five ");words.put(6, "Six ");
        words.put(7, "Seven ");words.put(8, "Eight ");words.put(9, "Nine ");
        words.put(10, "Ten ");words.put(20, "Twenty ");words.put(30, "Thirty ");
        words.put(40, "Forty ");words.put(50, "Fifty ");words.put(60, "Sixty ");
        words.put(70, "Seventy ");words.put(80, "Eighty ");words.put(90, "Ninety ");
        words.put(11, "Eleven ");words.put(12, "Twelve ");words.put(13, "Thirteen ");
        words.put(14, "Fourteen ");words.put(15, "Fifteen ");words.put(16, "Sixteen ");
        words.put(17, "Seventeen ");words.put(18, "Eighteen ");words.put(19, "Nineteen ");
        words.put(100, "Hundred ");words.put(1000, "Thousand ");words.put(1000000, "Million ");
        words.put(1_000_000_000, "Billion ");

        while(num > 0){
            temp = num % 1000;
            if(temp == 0){
                multiplier *= 1000;
                num /= 1000;
                continue;
            }
            if(multiplier != 1){
                result.insert(0, words.get(multiplier));
            }
            if(temp % 10 == 0){
                if((temp / 10) % 10 != 0){
                    result.insert(0, words.get(temp % 100));
                }
            }
            else {
                if((temp / 10) % 10 == 1){
                    result.insert(0, words.get(temp % 100));
                }
                else {
                    result.insert(0, words.get(temp % 10));
                    if((temp / 10) % 10 != 0){
                        result.insert(0, words.get(temp % 100 - temp % 10));
                    }
                }
            }
            if(temp / 100 != 0){
                result.insert(0, "Hundred ");
                result.insert(0, words.get(temp / 100));
            }
            multiplier *= 1000;
            num /= 1000;
        }
        return result.toString().trim();
    }
}