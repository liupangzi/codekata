A matrix is *Toeplitz* if every diagonal from top-left to bottom-right has the same element.

Now given an `M x N` matrix, return `True` if and only if the matrix is *Toeplitz*.

**Example 1:**
<pre>
<b>Input:</b> matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
<b>Output:</b> True
<b>Explanation:</b>
1234
5123
9512

In the above grid, the diagonals are "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]", and in each diagonal all elements are the same, so the answer is True.
</pre>

**Example 2:**
<pre>
<b>Input:</b> matrix = [[1,2],[2,2]]
<b>Output:</b> False
<b>Explanation:</b>
The diagonal "[1, 2]" has different elements.
</pre>

**Note:**

 1. `matrix` will be a 2D array of integers.
 2. `matrix` will have a number of rows and columns in range `[1, 20]`.
 3. `matrix[i][j]` will be integers in range `[0, 99]`.

### [Editorial](https://leetcode.com/articles/toeplitz-matrix/)
