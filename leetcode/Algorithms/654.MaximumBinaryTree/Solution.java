public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {
        if (start == end) return new TreeNode(nums[start]);

        int maxIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (nums[maxIndex] < nums[i]) maxIndex = i;
        }
        TreeNode result = new TreeNode(nums[maxIndex]);
        if (maxIndex != start) result.left = helper(nums, start, maxIndex - 1);
        if (maxIndex != end) result.right = helper(nums, maxIndex + 1, end);
        return result;
    }
}
