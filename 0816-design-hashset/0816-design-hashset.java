class MyHashSet {
    private HashMap<Integer, Integer> map;
    public MyHashSet() {
        map = new HashMap<Integer, Integer>();
    }
    
    public void add(int key) {
        if(map.get(key) != null){
            return;
        }
        map.put(key, 1);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
    
    public boolean contains(int key) {
        return map.get(key) != null;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */