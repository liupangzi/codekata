import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        };
        PriorityQueue<ListNode> queue = new PriorityQueue<>(comparator);
        for (ListNode list : lists)
            if (list != null) queue.add(list);

        ListNode dummyHead = new ListNode(0), cur = dummyHead;
        while (!queue.isEmpty()) {
            cur.next = queue.poll();
            cur = cur.next;
            if (cur.next != null) queue.add(cur.next);
        }

        return dummyHead.next;
    }
}
