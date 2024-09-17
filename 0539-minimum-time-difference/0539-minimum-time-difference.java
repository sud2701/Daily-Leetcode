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
        int diff1 = Math.min(times[1] - times[0], 1440 - times[n - 1] + times[0]);
        int min_diff = Math.min(diff1, Math.min(1440 - times[0] + times[n - 1], times[n - 1] - times[n - 2]));
        index = 1;
        while(index < n - 1){
            curr_diff = Math.min(times[index] - times[index - 1], times[index + 1] - times[index]);
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