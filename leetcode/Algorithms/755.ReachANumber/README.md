You are standing at position `0` on an infinite number line. There is a goal at position `target`.

On each move, you can either go left or right. During the *n*-th move (starting from 1), you take *n* steps.

Return the minimum number of steps required to reach the destination.

**Example 1:**
<pre>
<b>Input:</b> target = 3
<b>Output:</b> 2
<b>Explanation:</b>
On the first move we step from 0 to 1.
On the second step we step from 1 to 3.
</pre>

**Example 2:**
<pre>
<b>Input:</b> target = 2
<b>Output:</b> 3
<b>Explanation:</b>
On the first move we step from 0 to 1.
On the second move we step  from 1 to -1.
On the third move we step from -1 to 2.
</pre>

**Note:**

 - `target` will be a non-zero integer in the range `[-10^9, 10^9]`.

### [Editorial](https://leetcode.com/articles/reach-a-number/)
