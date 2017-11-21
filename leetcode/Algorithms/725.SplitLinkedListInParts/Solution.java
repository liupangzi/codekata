class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int sum = 0;
        ListNode tmp = root;
        while (tmp != null) {
            tmp = tmp.next;
            sum++;
        }

        int half = sum % k, count = sum / k;
        ListNode[] result = new ListNode[k];
        for (int i = 0; i < k; i++) {
            if (root == null) break;
            tmp = root;
            result[i] = root;
            int boundary = i < half ? count : count - 1;
            for (int j = 0; j < boundary; j++) tmp = tmp.next;
            root = tmp.next;
            tmp.next = null;
        }
        return result;
    }
}
