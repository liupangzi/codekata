public class Solution {

    private Random random;
    private ListNode head;

    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    public int getRandom() {
        ListNode tmp = this.head;
        int result = tmp.val, count = 1;

        while (tmp != null) {
            if (random.nextInt(count++) == 0) result = tmp.val;
            tmp = tmp.next;
        }

        return result;
    }
}
