/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        preorderHelper(root, res);
        return res;
    }

    public void preorderHelper(Node root, List<Integer> res){
        if(root != null){
            res.add(root.val);
            List<Node> children = root.children;
            int n = children.size();
            for(int i = 0; i < n; i++){
                Node temp = children.get(i);
                if(temp != null){
                    preorderHelper(temp, res);
                }
            }
        }
        else {
            return;
        }
    }
}