/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = (l1.val + l2.val) / 10;
        ListNode ln = new ListNode((l1.val + l2.val) % 10);
        ListNode shadow = ln;

        while(l1.next != null || l2.next != null || carry == 1) {
            int l1_val = 0, l2_val = 0;

            if (l1.next != null) {
                l1 = l1.next;
                l1_val = l1.val;
            }

            if (l2.next != null) {
                l2 = l2.next;
                l2_val = l2.val;
            }

            int sum = l1_val + l2_val + carry;
            carry = sum / 10;
            shadow.next = new ListNode(sum % 10);
            shadow = shadow.next;
        }
        
        return ln;
    }
}
