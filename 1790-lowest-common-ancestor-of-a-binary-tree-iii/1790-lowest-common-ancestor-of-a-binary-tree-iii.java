/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        HashSet<Node> set = new HashSet<Node>();
        set.add(p);
        while(p.parent != null){
            set.add(p.parent);
            p = p.parent;
        }
        if(!set.add(q)){
            return q;
        }
        while(q.parent != null){
            if(!set.add(q.parent)){
                return q.parent;
            }
            q = q.parent;
        }
        return null;
    }
}