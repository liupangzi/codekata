Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:

 1. `Copy All`: You can copy all the characters present on the notepad (partial copy is not allowed).
 2. `Paste`: You can paste the characters which are copied **last time**.

Given a number `n`. You have to get **exactly** `n` 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get `n` 'A'.

**Example 1:**
<pre>
<b>Input:</b> 3
<b>Output:</b> 3
<b>Explanation:</b>
Intitally, we have one character 'A'.
In step 1, we use <b>Copy All</b> operation.
In step 2, we use <b>Paste</b> operation to get 'AA'.
In step 3, we use <b>Paste</b> operation to get 'AAA'.
</pre>

**Note:**

 1. The `n` will be in the range [1, 1000].
