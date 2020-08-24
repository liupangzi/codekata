import java.util.Stack;

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) return new int[]{};

        ListNode tmp = head;
        int size = 0;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }

        int cursor = 0;
        int[] result = new int[size];
        Stack<int[]> stack = new Stack<>();
        while (true) {
            while (!stack.empty() && stack.peek()[1] < head.val) {
                result[stack.pop()[0]] = head.val;
            }

            if (head.next == null) break;
            if (head.next.val > head.val) {
                result[cursor] = head.next.val;
            } else {
                stack.add(new int[]{cursor, head.val});
            }
            head = head.next;
            cursor++;
        }
        return result;
    }
}
