Given an array `arr` that is a permutation of `[0, 1, ..., arr.length - 1]`, we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.

What is the most number of chunks we could have made?

**Example 1:**
<pre>
<b>Input:</b> arr = [4,3,2,1,0]
<b>Output:</b> 1
<b>Explanation:</b>
Splitting into two or more chunks will not return the required result.
For example, splitting into [4, 3], [2, 1, 0] will result in [3, 4, 0, 1, 2], which isn't sorted.
</pre>

**Example 2:**
<pre>
<b>Input:</b> arr = [1,0,2,3,4]
<b>Output:</b> 4
<b>Explanation:</b>
We can split into two chunks, such as [1, 0], [2, 3, 4].
However, splitting into [1, 0], [2], [3], [4] is the highest number of chunks possible.
</pre>

**Note:**

 1. `arr` will have length in range `[1, 10]`.
 2. `arr[i]` will be a permutation of `[0, 1, ..., arr.length - 1]`.

### [Editorial](https://leetcode.com/articles/max-chunks-to-make-sorted-i/)
