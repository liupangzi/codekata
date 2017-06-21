Given two integers `n` and `k`, find how many different arrays consist of numbers from `1` to `n` such that there are exactly `k` inverse pairs.

We define an inverse pair as following: For <code>i<sub>th</sub></code> and <code>j<sub>th</sub></code> element in the array, if `i` < `j` and `a[i]` > `a[j]` then it's an inverse pair; Otherwise, it's not.

Since the answer may very large, the answer should be modulo 10<sup>9</sup> + 7.

**Example 1:**
<pre>
<b>Input:</b> n = 3, k = 0
<b>Output:</b> 1
<b>Explanation:</b> 
Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pair.
</pre>

**Example 2:**
<pre>
<b>Input:</b> n = 3, k = 1
<b>Output:</b> 2
<b>Explanation:</b> 
The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
</pre>

**Note:**

 1. The integer `n` is in the range [1, 1000] and `k` is in the range [0, 1000].

### [Editorial](https://leetcode.com/articles/k-inverse-pairs-array/)
