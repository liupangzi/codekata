import java.util.HashMap;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode dummyHead = new RandomListNode(0), cursor = dummyHead;
        while (head != null) {
            cursor.next = map.getOrDefault(head, new RandomListNode(head.label));
            if (head.random != null) {
                cursor.next.random = map.getOrDefault(head.random, new RandomListNode(head.random.label));
                map.put(head.random, cursor.next.random);
            }
            head = head.next;
            cursor = cursor.next;
        }
        return dummyHead.next;
    }
}
