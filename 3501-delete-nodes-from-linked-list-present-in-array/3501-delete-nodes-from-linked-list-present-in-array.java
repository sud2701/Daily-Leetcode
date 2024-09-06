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
        int maximum = 0;
        for(int i: nums){
            maximum = Math.max(maximum, i);
        }
        boolean[] beDeleted = new boolean[maximum + 1];
        for(int i: nums){
            beDeleted[i] = true;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr.val <= maximum && beDeleted[curr.val]){
                if(curr == head){
                    head = curr.next;
                }
                else {
                    prev.next = curr.next;
                }
            }
            else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}