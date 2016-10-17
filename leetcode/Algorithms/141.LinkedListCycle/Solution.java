/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode stepOne = head, stepTwo = head;
        while (stepTwo != null && stepTwo.next != null && stepTwo.next.next != null) {
            stepOne = stepOne.next;
            stepTwo = stepTwo.next.next;
            if (stepOne == stepTwo) return true;
        }
        return false;
    }
}
