Given an array of integers and an integer **k**, you need to find the number of **unique** k-diff pairs in the array. Here a **k-diff** pair is defined as an integer pair (i, j), where **i** and **j** are both numbers in the array and their [absolute difference][1] is **k**.

**Example 1:**
<pre>
<b>Input:</b> [3, 1, 4, 1, 5], k = 2
<b>Output:</b> 2
<b>Explanation:</b> There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of <b>unique</b> pairs.
</pre>

**Example 2:**
<pre>
<b>Input:</b> [1, 2, 3, 4, 5], k = 1
<b>Output:</b> 4
<b>Explanation:</b> There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
</pre>

**Example 3:**
<pre>
<b>Input:</b> [1, 3, 1, 5, 4], k = 0
<b>Output:</b> 1
<b>Explanation:</b> There is one 0-diff pair in the array, (1, 1).
</pre>

**Note:**

 1. The pairs (i, j) and (j, i) count as the same pair.
 2. The length of the array won't exceed 10,000.
 3. All the integers in the given input belong to the range: [-1e7, 1e7].

  [1]: https://en.wikipedia.org/wiki/Absolute_difference
