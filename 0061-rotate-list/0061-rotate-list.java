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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            n += 1;
        }
        k = k % n;
        if(k == 0){
            return head;
        }
        ListNode prev = null;
        curr = head;
        for(int i = 1; i < n - k + 1; i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        ListNode temp = curr;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = head;
        head = temp;
        return head;
    }
}