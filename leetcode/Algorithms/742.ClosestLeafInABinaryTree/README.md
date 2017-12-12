Given a binary tree **where every node has a unique value**, and a target key `k`, find the closest leaf node to target `k` in the tree.

A node is called a *leaf* if it has no children.

In the following examples, the input tree is represented in flattened form row by row. The actual `root` tree given will be a TreeNode object.

**Example 1:**
<pre>
<b>Input:</b>
root = [1, 3, 2], k = 1
Diagram of binary tree:
          1
         / \
        3   2

<b>Output:</b> 2 (or 3)

<b>Explanation:</b> Either 2 or 3 is the closest leaf node to 1.
</pre>

**Example 2:**
<pre>
<b>Input:</b>
root = [1], k = 1
<b>Output:</b> 1

<b>Explanation:</b> The closest leaf node is the root node itself.
</pre>

**Example 3:**
<pre>
<b>Input:</b>
root = [1,2,3,4,null,null,null,5,null,6], k = 2
Diagram of binary tree:
             1
            / \
           2   3
          /
         4
        /
       5
      /
     6

<b>Output:</b> 3
<b>Explanation:</b> The leaf node with value 3 (and not the leaf node with value 6) is closest to the node with value 2.
</pre>

**Note:**

 1. `root` represents a binary tree with at least `1` node and at most `1000` nodes.
 2. Every node has a unique `node.val` in range `[1, 1000]`.
 3. There exists some node in the given binary tree for which `node.val == k`.

### [Editorial](https://leetcode.com/articles/closest-leaf-in-binary-tree/)
