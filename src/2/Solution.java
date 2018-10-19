/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, prev = null;
        int carry = 0, val1, val2;

        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            else val1 = 0;
            
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            else val2 = 0;

            int sum = val1 + val2 + carry;
            ListNode curr = new ListNode(sum % 10);
            carry = sum / 10;
            if (head == null) head = curr;
            else prev.next = curr;
            prev = curr;
        }
        return head;
    }
}