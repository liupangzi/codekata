We have some permutation `A` of `[0, 1, ..., N - 1]`, where `N` is the length of `A`.

The number of (global) inversions is the number of `i < j` with `0 <= i < j < N` and `A[i] > A[j]`.

The number of local inversions is the number of `i` with `0 <= i < N` and `A[i] > A[i+1]`.

Return `true` if and only if the number of global inversions is equal to the number of local inversions.

**Example 1:**
<pre>
<b>Input:</b> A = [1,0,2]
<b>Output:</b> true
<b>Explanation:</b> There is 1 global inversion, and 1 local inversion.
</pre>

**Example 2:**
<pre>
<b>Input:</b> A = [1,2,0]
<b>Output:</b> false
<b>Explanation:</b> There are 2 global inversions, and 1 local inversion.
</pre>

**Note:**

 - `A` will be a permutation of `[0, 1, ..., A.length - 1]`.
 - `A` will have length in range `[1, 5000]`.
