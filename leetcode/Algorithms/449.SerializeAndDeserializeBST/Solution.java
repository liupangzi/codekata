/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private HashMap<Integer, Integer> map = new HashMap<>();

    private int preIndex = 0;

    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder preOrder = new StringBuilder(), inOrder = new StringBuilder();
        preOrderTravel(root, preOrder);
        inOrderTravel(root, inOrder);
        return preOrder.substring(1) + "|" + inOrder.substring(1);
    }

    private void inOrderTravel(TreeNode treeNode, StringBuilder inOrder) {
        if (treeNode == null) return;
        inOrderTravel(treeNode.left, inOrder);
        inOrder.append(",").append(treeNode.val);
        inOrderTravel(treeNode.right, inOrder);
    }

    private void preOrderTravel(TreeNode treeNode, StringBuilder preOrder) {
        if (treeNode == null) return;
        preOrder.append(",").append(treeNode.val);
        preOrderTravel(treeNode.left, preOrder);
        preOrderTravel(treeNode.right, preOrder);
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;
        int position = data.indexOf("|");
        String pre[] = data.substring(0, position).split(","), in[] = data.substring(position + 1).split(",");
        int preOrder[] = new int[pre.length], inOrder[] = new int[in.length];
        for (int i = 0; i < pre.length; i++) preOrder[i] = Integer.valueOf(pre[i]);
        for (int i = 0; i < in.length; i++) inOrder[i] = Integer.valueOf(in[i]);

        for (int i = 0; i < inOrder.length; i++) this.map.put(inOrder[i], i);
        return builder(preOrder, inOrder, 0, inOrder.length - 1);
    }

    private TreeNode builder(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;
        int inOrderIndex = map.get(preorder[preIndex++]);
        TreeNode result = new TreeNode(inorder[inOrderIndex]);
        result.left = builder(preorder, inorder, start, inOrderIndex - 1);
        result.right = builder(preorder, inorder, inOrderIndex + 1, end);
        return result;
    }
}
