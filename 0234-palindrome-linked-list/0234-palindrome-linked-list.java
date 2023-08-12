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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        String str = "";
        while(curr != null){
            str += curr.val;
            curr = curr.next;
        }
        int n = str.length();
        int i = 0;
        int j = n - 1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}