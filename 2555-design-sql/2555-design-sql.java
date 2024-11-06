class SQL {
    private HashMap<String, ArrayList<ArrayList<String>>> map;
    private HashMap<String, Integer> currTableId;
    public SQL(List<String> names, List<Integer> columns) {
        int n = names.size();
        map = new HashMap<String, ArrayList<ArrayList<String>>>();
        currTableId = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            map.put(names.get(i), new ArrayList<ArrayList<String>>());
        }
    }
    
    public void insertRow(String name, List<String> row) {
        if(currTableId.get(name) == null){
            currTableId.put(name, 1);
        }
        else {
            currTableId.put(name, currTableId.get(name) + 1);
        }
        ArrayList<ArrayList<String>> rows = map.get(name);
        rows.add(new ArrayList<>(row));
        map.put(name, rows);
    }
    
    public void deleteRow(String name, int rowId) {
        
    }
    
    public String selectCell(String name, int rowId, int columnId) {
        if(map.get(name) == null){
            return null;
        }
        else {
            return map.get(name).get(rowId - 1).get(columnId - 1);
        }
    }
}

/**
 * Your SQL object will be instantiated and called as such:
 * SQL obj = new SQL(names, columns);
 * obj.insertRow(name,row);
 * obj.deleteRow(name,rowId);
 * String param_3 = obj.selectCell(name,rowId,columnId);
 */