There is a room with `n` lights which are turned on initially and 4 buttons on the wall. After performing exactly `m` unknown operations towards buttons, you need to return how many different kinds of status of the `n` lights could be.

Suppose `n` lights are labeled as number [1, 2, 3 ..., n], function of these 4 buttons are given below:

 1. Flip all the lights.
 2. Flip lights with even numbers.
 3. Flip lights with odd numbers.
 4. Flip lights with (3k + 1) numbers, k = 0, 1, 2, ...

**Example 1:**
<pre>
<b>Input:</b> n = 1, m = 1.
<b>Output:</b> 2
<b>Explanation:</b> Status can be: [on], [off]
</pre>

**Example 2:**
<pre>
<b>Input:</b> n = 2, m = 1.
<b>Output:</b> 3
<b>Explanation:</b> Status can be: [on, off], [off, on], [off, off]
</pre>

**Example 3:**
<pre>
<b>Input:</b> n = 3, m = 1.
<b>Output:</b> 4
<b>Explanation:</b> Status can be: [off, on, off], [on, off, on], [off, off, off], [off, on, on].
</pre>

**Note:** `n` and `m` both fit in range [0, 1000].
