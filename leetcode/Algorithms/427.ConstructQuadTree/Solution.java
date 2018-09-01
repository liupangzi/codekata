class Solution {
    public Node construct(int[][] grid) {
        return helper(grid, 0, 0, grid.length, grid.length);
    }

    private Node helper(int[][] grid, int a, int b, int c, int d) {
        if (a == c - 1) {
            return new Node(grid[a][b] == 1, true, null, null, null, null);
        }

        Node topLeft = helper(grid, a, b, (a + c) >> 1, (b + d) >> 1);
        Node bottomLeft = helper(grid, (a + c) >> 1, b, c, (b + d) >> 1);
        Node topRight = helper(grid, a, (b + d) >> 1, (a + c) >> 1, d);
        Node bottomRight = helper(grid, (a + c) >> 1, (b + d) >> 1, c, d);

        if (
                topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRight.val && topLeft.val == bottomLeft.val && topLeft.val == bottomRight.val
        ) {
            return new Node(grid[a][b] == 1, true, null, null, null, null);
        } else {
            return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
        }
    }
}
