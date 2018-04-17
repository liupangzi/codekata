import java.util.HashSet;

class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> set = new HashSet<>();
        for (int g : G) set.add(g);

        int result = 0, counter = 0;
        while (head != null) {
            if (set.contains(head.val)) {
                counter++;
            } else {
                if (counter != 0) {
                    counter = 0;
                    result++;
                }
            }
            head = head.next;
        }
        return counter == 0 ? result : result + 1;
    }
}
