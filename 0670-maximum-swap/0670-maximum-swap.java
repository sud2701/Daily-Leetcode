class Solution {
    public int maximumSwap(int num) {
        int temp = num;
        int num_digits = 0;
        while(temp > 0){
            temp = temp / 10;
            num_digits++;
        }
        if(num_digits <= 1){
            return num;
        }
        int[] digits = new int[num_digits];
        int[] max_after = new int[num_digits - 1];
        int maximum = digits[num_digits - 1];
        int max_index = num_digits - 1;
        int i = 0;
        temp = num;
        i = num_digits - 1;
        while(temp > 0){
            digits[i] = temp % 10;
            i--;
            temp = temp / 10;
        }
        for(i = num_digits - 2; i >= 0; i--){
            if(digits[i + 1] > maximum){
                maximum = digits[i + 1];
                max_index = i + 1;
            }
            max_after[i] = max_index;
        }
        for(i = 0; i < num_digits - 1; i++){
            if(digits[i] < digits[max_after[i]]){
                digits[i] = digits[i] + digits[max_after[i]];
                digits[max_after[i]] = digits[i] - digits[max_after[i]];
                digits[i] = digits[i] - digits[max_after[i]];
                break;
            }
        }
        if(i == num_digits){
            return num;
        }
        int result = 0;
        for(i = 0; i < num_digits; i++){
            result = (result * 10) + digits[i];
        }
        return result;
    }
}