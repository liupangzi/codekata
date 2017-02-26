import java.util.Stack;

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
        Stack<Integer> a = new Stack<>(), b = new Stack<>();
        while (l1 != null) {
            a.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            b.push(l2.val);
            l2 = l2.next;
        }

        ListNode result = null;
        int carry = 0;
        while (a.size() > 0 || b.size() > 0 || carry > 0) {
            int m = a.size() > 0 ? a.pop() : 0, n = b.size() > 0 ? b.pop() : 0, sum = m + n + carry;
            carry = sum / 10;
            ListNode tmp = new ListNode(sum % 10);
            tmp.next = result;
            result = tmp;
        }

        return result;
    }
}
