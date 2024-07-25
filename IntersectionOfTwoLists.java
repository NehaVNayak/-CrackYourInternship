//https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/1333105950/

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
        if(headA == null || headB == null) {
            return null;
        }
        while(headB != null) {
            ListNode temp = headA;
            while(temp != null) {
            if(headB == temp) {
                return headB;
            }
            temp = temp.next;
      }
        headB = headB.next;
    }
    return null;
    }
}
