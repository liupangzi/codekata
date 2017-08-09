Given a binary search tree and the lowest and highest boundaries as `L` and `R`, trim the tree so that all its elements lies in `[L, R]` (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

**Example 1:**
<pre>
<b>Input:</b>
    1
   / \
  0   2

  L = 1
  R = 2

<b>Output:</b>
    1
      \
       2
</pre>

**Example 2:**
<pre>
<b>Input:</b>
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

<b>Output:</b>
      3
     / 
   2   
  /
 1
</pre>
