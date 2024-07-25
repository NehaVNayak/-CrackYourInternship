https://leetcode.com/problems/merge-two-sorted-lists/

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
    public ListNode mergeTwoLists(ListNode first, ListNode second) {
       ListNode dummy = new ListNode();
       ListNode current = dummy;

       while(first != null && second != null) {
           if(first.val <= second.val) {
               current.next = first;
               first = first.next;
           } else {
               current.next = second;
               second = second.next;
           }
           current = current.next;
       }
        if (first != null) {
            current.next = first;
        } else {
            current.next = second;
        }
        
    return dummy.next;
    }

}
