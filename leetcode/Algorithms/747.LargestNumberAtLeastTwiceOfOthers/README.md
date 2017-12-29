In a given integer array `nums`, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the **index** of the largest element, otherwise return -1.

**Example 1:**
<pre>
<b>Input:</b> nums = [3, 6, 1, 0]
<b>Output:</b> 1
<b>Explanation:</b> 6 is the largest integer, and for every other number in the array x,
6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
</pre>

**Example 2:**
<pre>
<b>Input:</b> nums = [1, 2, 3, 4]
<b>Output:</b> -1
<b>Explanation:</b> 4 isn't at least as big as twice the value of 3, so we return -1.
</pre>

**Note:**

 1. `nums` will have a length in the range `[1, 50]`.
 2. Every `nums[i]` will be an integer in the range `[0, 99]`.

### [Editorial](https://leetcode.com/articles/number-greater-than-twice-of-others/)
