A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers **from 1 to 9** such that each row, column, and both diagonals all have the same sum.

Given an `grid` of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).

**Example 1:**

<pre>
<b>Input:</b> [[4,3,8,4],
        [9,5,1,9],
        [2,7,6,2]]
<b>Output:</b> 1
<b>Explanation:</b> 
The following subgrid is a 3 x 3 magic square:
438
951
276

while this one is not:
384
519
762

In total, there is only one magic square inside the given grid.
</pre>

**Note:**

1. `1 <= grid.length <= 10`
2. `1 <= grid[0].length <= 10`
3. `0 <= grid[i][j] <= 15`

### [Editorial](https://leetcode.com/articles/magic-squares-in-grid/)
