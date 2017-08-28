Given a sorted array, two integers `k` and `x`, find the `k` closest elements to `x` in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

**Example 1:**
<pre>
<b>Input:</b> [1,2,3,4,5], k=4, x=3
<b>Output:</b> [1,2,3,4]
</pre>

**Example 2:**
<pre>
<b>Input:</b> [1,2,3,4,5], k=4, x=-1
<b>Output:</b> [1,2,3,4]
</pre>

**Note:**
 1. The value k is positive and will always be smaller than the length of the sorted array.
 2. Length of the given array is positive and will not exceed 10<sup>4</sup>
 3. Absolute value of elements in the array and x will not exceed 10<sup>4</sup>
