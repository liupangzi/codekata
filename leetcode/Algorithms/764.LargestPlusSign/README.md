In a 2D `grid` from (0, 0) to (N-1, N-1), every cell contains a `1`, except those cells in the given list `mines` which are `0`. What is the largest axis-aligned plus sign of `1`s contained in the grid? Return the order of the plus sign. If there is none, return 0.

An "*axis-aligned plus sign of `1`s* of order **k**" has some center `grid[x][y] = 1` along with 4 arms of length `k-1` going up, down, left, and right, and made of `1`s. This is demonstrated in the diagrams below. Note that there could be `0`s or `1`s beyond the arms of the plus sign, only the relevant area of the plus sign is checked for 1s.

**Examples of Axis-Aligned Plus Signs of Order k:**
<pre>
Order 1:
000
0<b>1</b>0
000

Order 2:
00000
00<b>1</b>00
0<b>111</b>0
00<b>1</b>00
00000

Order 3:
0000000
000<b>1</b>000
000<b>1</b>000
0<b>11111</b>0
000<b>1</b>000
000<b>1</b>000
0000000
</pre>

**Example 1:**
<pre>
<b>Input:</b> N = 5, mines = [[4, 2]]
<b>Output:</b> 2
<b>Explanation:</b>
11111
11111
1<b>1</b>111
<b>111</b>11
1<b>1</b>011
In the above grid, the largest plus sign can only be order 2.  One of them is marked in bold.
</pre>

**Example 2:**
<pre>
<b>Input:</b> N = 2, mines = []
<b>Output:</b> 1
<b>Explanation:</b>
There is no plus sign of order 2, but there is of order 1.
</pre>

**Example 3:**
<pre>
<b>Input:</b> N = 1, mines = [[0, 0]]
<b>Output:</b> 0
<b>Explanation:</b>
There is no plus sign, so return 0.
</pre>

**Note:**

 1. `N` will be an integer in the range `[1, 500]`.
 2. `mines` will have length at most `5000`.
 3. `mines[i]` will be length 2 and consist of integers in the range `[0, N-1]`.
 4. *(Additionally, programs submitted in C, C++, or C# will be judged with a slightly smaller time limit.)*

### [Editorial](https://leetcode.com/articles/largest-plus-sign/)
