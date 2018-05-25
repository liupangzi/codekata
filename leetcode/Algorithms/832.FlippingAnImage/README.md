Given a binary matrix `A`, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping `[1, 1, 0]` horizontally results in `[0, 1, 1]`.

To invert an image means that each `0` is replaced by `1`, and each `1` is replaced by `0`. For example, inverting `[0, 1, 1]` results in `[1, 0, 0]`.

**Example 1:**

<pre>
<b>Input:</b> [[1,1,0],[1,0,1],[0,0,0]]
<b>Output:</b> [[1,0,0],[0,1,0],[1,1,1]]
<b>Explanation:</b> First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
</pre>

**Example 2:**

<pre>
<b>Input:</b> [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
<b>Output:</b> [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
<b>Explanation:</b> First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
</pre>

**Notes:**

- `1 <= A.length = A[0].length <= 20`
- `0 <= A[i][j] <= 1`

### [Editorial](https://leetcode.com/articles/flipping-an-image/)
