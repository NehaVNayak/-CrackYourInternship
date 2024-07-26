//https://leetcode.com/problems/add-two-numbers-ii/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = reverseLL(l1);
        ListNode second = reverseLL(l2);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(first != null || second != null || carry !=0){
            int sum = carry;
            if(first != null) {
                sum += first.val;
                first = first.next;
            }
            if(second != null) {
                sum += second.val;
                second = second.next;
            }
            carry  = sum / 10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        return reverseLL(dummy.next);
    }
    public ListNode reverseLL(ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode nex = pres.next;
        while(pres != null) {
            pres.next = prev;
            prev = pres;
            pres = nex;
            if(nex != null) {
                nex = nex.next;
            }
        }
        head = prev;
        return head;
    }
}
