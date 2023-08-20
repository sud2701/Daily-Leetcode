class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer> ();
        for(int i = 1; i <= n; i++){
            map.put(i, 0);
        }
        int k = trust.length;
        for(int i = 0; i < k; i++){
            if(map.keySet().contains(trust[i][0])){
                map.remove(trust[i][0]);
            }
            if(map.keySet().contains(trust[i][1])){
                int temp = map.get(trust[i][1]);
                map.put(trust[i][1], temp + 1);
            }
        }
        int trusted_freq = 0;
        for(int x: map.keySet()){
            trusted_freq = map.get(x);
            if(trusted_freq == n - 1){
                return x;
            }
        }
        return -1;
    }
}