//https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null) {
            return head;
        }
        
        while(head != null && head.val == val) {
            head = head.next;
        } 
        
        ListNode prev = head;
        ListNode pres = head;
        
        while(pres != null) {
            if(pres.val == val) {
               prev.next = pres.next;
            } else {
                prev = pres;
            }
            pres = pres.next;
        }
        
        return head; 
        
        
    }
}
