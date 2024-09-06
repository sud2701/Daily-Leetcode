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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            set.add(i);
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(!set.add(curr.val)){
                if(curr == head){
                    head = curr.next;
                }
                else {
                    prev.next = curr.next;
                }
            }
            else {
                prev = curr;
                set.remove(curr.val);
            }
            curr = curr.next;
        }
        return head;
    }
}