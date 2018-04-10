func pruneTree(root *TreeNode) *TreeNode {
	dummyHead := TreeNode{Val: 0, Left: root}
	travel(&dummyHead)
	return dummyHead.Left
}

func travel(node *TreeNode) int {
	if node == nil {
		return 0
	}

	left := travel(node.Left)
	if left == 0 {
		node.Left = nil
	}

	right := travel(node.Right)
	if right == 0 {
		node.Right = nil
	}

	return node.Val + right + left
}

