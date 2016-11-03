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
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        while (headA != null) {
            hashMap.put(headA.val, 0);
            headA = headA.next;
        }

        while (headB != null && !hashMap.containsKey(headB.val)) {
            headB = headB.next;
        }

        return headB;
    }
}
