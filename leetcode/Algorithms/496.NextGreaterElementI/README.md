You are given two arrays **(without duplicates)** `nums1` and `nums2` where `nums1`’s elements are subset of `nums2`. Find all the next greater numbers for `nums1`'s elements in the corresponding places of `nums2`.

The Next Greater Number of a number **x** in `nums1` is the first greater number to its right in `nums2`. If it does not exist, output -1 for this number.

**Example 1:**
<pre>
<b>Input:</b> nums1 = [4,1,2], nums2 = [1,3,4,2].
<b>Output</b>: [-1,3,-1]
<b>Explanation:</b>
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
</pre>

**Example 2:**
<pre>
<b>Input:</b> nums1 = [2,4], nums2 = [1,2,3,4].
<b>Output:</b> [3,-1]
<b>Explanation:</b>
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
</pre>

**Note:**

 1. All elements in `nums1` and `nums2` are unique.
 2. The length of both `nums1` and `nums2` would not exceed 1000.
