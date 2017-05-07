public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (s.val == t.val && isEqual(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isEqual(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if ((a == null && b != null) || (a != null && b == null)) return false;
        if (a.val != b.val) return false;
        return isEqual(a.left, b.left) && isEqual(a.right, b.right);
    }
}
