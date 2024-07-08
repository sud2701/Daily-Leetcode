/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Pair> points = new ArrayList<Pair> ();
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        int len = 0;
        int[] result = {-1, -1};
        while(curr.next != null) {
            if(prev.val < curr.val && curr.next.val < curr.val) {
                points.add(new Pair(curr.val, index));
                len++;
            }
            else if(prev.val > curr.val && curr.next.val > curr.val) {
                points.add(new Pair(curr.val, index));
                len++;
            }
            index += 1;
            prev = curr;
            curr = curr.next;
        }
        if(len >= 2) {
            int min_dist = 1000000;
            Pair x;
            Pair y;
            for(int i = 0; i < len - 1; i++) {
                x = points.get(i);
                y = points.get(i + 1);
                min_dist = Math.min(min_dist, Math.abs(x.index - y.index));
            }
            result[0] = min_dist;
            result[1] = points.get(len - 1).index - points.get(0).index;
        }
        return result;
    }
}

class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.index = index;
        this.value = value;
    }
}