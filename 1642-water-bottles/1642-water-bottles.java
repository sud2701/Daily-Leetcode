class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int curr_bottles = numBottles;
        int prev_remaining = 0;
        int result = 0;
        int prev_bottles = 0;
        while(curr_bottles + prev_remaining >= numExchange) {
            result += curr_bottles;
            prev_bottles = curr_bottles;
            curr_bottles = (curr_bottles + prev_remaining) / numExchange;
            prev_remaining = (prev_bottles + prev_remaining) % numExchange;
        }
        return result + curr_bottles;
    }
}