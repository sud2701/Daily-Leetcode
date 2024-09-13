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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode[] result = new ListNode[k];
        int len = 0;
        int i = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            i++;
            fast = fast.next.next;
        }
        len = 2 * i;
        if(fast != null){
            len += 1;
        }
        int part_length = len / k;
        int remainder = len % k;
        int index = 0;
        ListNode curr = head;
        ListNode prev = null;
        int end = 0;
        i = 1;
        while(index < k){
            if(part_length == 0 && remainder == 0){
                break;
            }
            else if(part_length + remainder > 0){
                result[index] = curr;
                index++;
                end = i + part_length - 1;
                if(remainder > 0){
                    end += 1;
                }
                while(i <= end){
                    prev = curr;
                    curr = curr.next;
                    i++;
                }
                prev.next = null;
                if(remainder > 0){
                    remainder--;
                }
            }
        }
        return result;
    }
}