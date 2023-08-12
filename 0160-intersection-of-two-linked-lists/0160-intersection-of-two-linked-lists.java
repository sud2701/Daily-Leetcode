/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode curr = headA;
        while(curr != null) {
            len1 += 1;
            curr = curr.next;
        }
        curr = headB;
        while(curr != null){
            len2 += 1;
            curr = curr.next;
        }
        ListNode currA = headA;
        ListNode currB = headB;
        if(len1 > len2){
            while(len1 > len2){
                currA = currA.next;
                len1 -= 1;
            }
        }
        else if(len2 > len1){
            while(len2 > len1){
                currB = currB.next;
                len2 -= 1;
            }
        }
        while(currA != null && currB != null){
            if(currA == currB){
                return currA;
            }
            else {
                currA = currA.next;
                currB = currB.next;
            }
        }
        return null;
    }
}