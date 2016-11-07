Given *n* points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points `(i, j, k)` such that the distance between `i` and `j` equals the distance between `i` and `k` (**the order of the tuple matters**).

Find the number of boomerangs. You may assume that *n* will be at most **500** and coordinates of points are all in the range **[-10000, 10000]** (inclusive).

**Example:**

<pre>
<b>Input:</b>
[[0,0],[1,0],[2,0]]

<b>Output:</b>
2

<b>Explanation:</b>
The two boomerangs are <b>[[1,0],[0,0],[2,0]]</b> and <b>[[1,0],[2,0],[0,0]]</b>
<pre>
