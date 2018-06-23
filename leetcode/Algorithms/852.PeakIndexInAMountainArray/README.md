Let's call an array `A` a *mountain* if the following properties hold:

- `A.length >= 3`
- There exists some `0 < i < A.length - 1` such that `A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]`

Given an array that is definitely a mountain, return any `i` such that `A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]`.

**Example 1:**

<pre>
<b>Input:</b> [0,1,0]
<b>Output:</b> 1
</pre>

**Example 2:**

<pre>
<b>Input:</b> [0,2,1,0]
<b>Output:</b> 1
</pre>

**Note:**

1. `3 <= A.length <= 10000`
2. `0 <= A[i] <= 10^6`
3. `A` is a mountain, as defined above.

### [Editorial](https://leetcode.com/articles/peak-index-in-a-mountain-array/)
