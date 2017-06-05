public class Solution {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        } else if (t.left == null) {
            if (t.right == null) {
                return String.valueOf(t.val);
            } else {
                return t.val + "()(" + tree2str(t.right) + ")";
            }
        } else {
            if (t.right == null) {
                return t.val + "(" + tree2str(t.left) + ")";
            } else {
                return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right) + ")";
            }
        }
    }
}
