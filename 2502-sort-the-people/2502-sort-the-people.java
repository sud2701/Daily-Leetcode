class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>((a, b) -> b.height - a.height);
        int n = names.length;
        for(int i = 0; i < n; i++) {
            maxHeap.add(new Pair(heights[i], names[i]));
        }
        for(int i = 0; i < n; i++) {
            names[i] = maxHeap.poll().name;
        }
        return names;
    }
}

class Pair {
    int height;
    String name;
    Pair(int height, String name) {
        this.height = height;
        this.name = name;
    }
}