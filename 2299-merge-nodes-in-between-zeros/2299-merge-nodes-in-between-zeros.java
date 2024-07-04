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
    public ListNode mergeNodes(ListNode head) {
        ListNode tempHead = null;
        ListNode tempCurr = tempHead;
        ListNode curr = head;
        int tempSum = 0;
        while(curr != null){
            if(curr.val == 0){
                if(tempSum == 0){
                    curr = curr.next;
                    continue;
                }
                else {
                    ListNode temp = new ListNode(tempSum);
                    if(tempHead == null){
                        tempHead = temp;
                        tempCurr = tempHead;
                    }
                    else {
                        tempCurr.next = temp;
                        tempCurr = temp;
                    }
                    tempSum = 0;
                }
            }
            else {
                tempSum += curr.val;
            }
            curr = curr.next;
        }
        return tempHead;
    }
}