We are given the head node `root` of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)

<pre>
<b>Example 1:</b>
<b>Input: [1,null,0,0,1]</b>
<b>Output: [1,null,0,null,1]</b>
 
<b>Explanation: </b>
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.

<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/06/1028_2.png">
</pre>

<pre>
<b>Example 2:</b>
<b>Input: [1,0,1,0,0,0,1]</b>
<b>Output: [1,null,1,null,1]</b>

<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/06/1028_1.png">
</pre>

<pre>
<b>Example 3:</b>
<b>Input: [1,1,0,1,1,0,1,0]</b>
<b>Output: [1,1,0,1,1,null,1]</b>

<img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/05/1028.png">
</pre>

**Note:**

- The binary tree will have at most `100 nodes`.
- The value of each node will only be `0` or `1`.

### [Editorial](https://leetcode.com/articles/binary-tree-pruning/)
