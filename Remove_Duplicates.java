//https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1332018255/

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                if(temp.next.next == null) {
                    temp.next = null;
                } else {
                    temp.next = temp.next.next;
                }
                
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
}
