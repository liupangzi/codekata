public class NumArray {
    private SegmentTree root;
    private int[] N;

    public NumArray(int[] nums) {
        N = nums;
        root = buildTree(nums, 0, nums.length - 1);
    }

    private SegmentTree buildTree(int[] nums, int start, int end) {
        SegmentTree tree = new SegmentTree();
        if (start == end) {
            tree.sum = nums[start];
        } else if (start < end) {
            int mid = (start + end) / 2;
            tree.left = buildTree(nums, start, mid);
            tree.right = buildTree(nums, mid + 1, end);
            tree.sum = tree.left.sum + tree.right.sum;
        }
        return tree;
    }

    public void update(int i, int val) {
        updateTree(root, i, val - N[i], 0, N.length - 1);
        N[i] = val;
    }

    private void updateTree(SegmentTree tree, int index, int delta, int start, int end) {
        tree.sum += delta;
        if (start == end) return;
        int mid = (start + end) / 2;
        if (index <= mid) {
            updateTree(tree.left, index, delta, start, mid);
        } else {
            updateTree(tree.right, index, delta, mid + 1, end);
        }
    }

    public int sumRange(int i, int j) {
        return sumTree(root, i, j, 0, N.length - 1);
    }

    private int sumTree(SegmentTree tree, int i, int j, int start, int end) {
        if (tree == null) return 0;
        if (i == start && j == end) return tree.sum;
        int mid = (start + end) / 2;
        if (j <= mid) return sumTree(tree.left, i, j, start, mid);
        if (i > mid) return sumTree(tree.right, i, j, mid + 1, end);
        return sumTree(tree.left, i, mid, start, mid) + sumTree(tree.right, mid + 1, j, mid + 1, end);
    }
}

class SegmentTree {
    int sum = 0;
    SegmentTree left, right;
}
