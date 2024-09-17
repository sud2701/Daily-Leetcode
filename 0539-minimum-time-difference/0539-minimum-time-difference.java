class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] times = new int[n];
        int index = 0;
        int curr_diff = 0;
        while(index < n){
            times[index] = timeToMinutes(timePoints.get(index));
            index++;
        }
        Arrays.sort(times);
        int min_diff = 1440 - times[n - 1] + times[0];
        index = 0;
        while(index < n - 1){
            curr_diff = times[index + 1] - times[index];
            min_diff = Math.min(curr_diff, min_diff);
            index++;
        }
        return min_diff;
    }

    public int timeToMinutes(String time) {
        int hours = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int minutes = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
        if(hours == 0 && minutes == 0){
            return 1440;
        }
        return (hours * 60) + minutes;
    }
}