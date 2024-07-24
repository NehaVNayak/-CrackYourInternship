//

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
    public int getDecimalValue(ListNode head) {
        if (head == null) {
            return -1;  // or throw an exception or handle the case appropriately
        }

        int sum = 0;
        while (head != null) {
            if (head.val != 0 && head.val != 1) {
                return -1;  // non-binary value
            }

            sum = sum * 2 + head.val;  // calculate sum properly
            head = head.next;
        }

        return sum;
    }
}
