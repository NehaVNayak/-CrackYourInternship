//https://leetcode.com/problems/palindrome-linked-list/description/

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
        ListNode middle = middleNode(head);
        ListNode secondHead = reverseList(middle);
        ListNode reverseHead = secondHead;
        while(secondHead != null && head != null) {
            if(secondHead.val != head.val) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(reverseHead);
        return head == null || secondHead == null;
    }

    public ListNode middleNode(ListNode head) {
        if(head == null && head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null && head.next == null) {
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
        return prev;
    }
}
