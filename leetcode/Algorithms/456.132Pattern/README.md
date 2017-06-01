Given a sequence of n integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>, a 132 pattern is a subsequence a<sub><b>i</b></sub>, a<sub><b>j</b></sub>, a<sub><b>k</b></sub> such that **i** < **j** < **k** and a<sub><b>i</b></sub> < a<sub><b>k</b></sub> < a<sub><b>j</b></sub>. Design an algorithm that takes a list of n numbers as input and checks whether there is a 132 pattern in the list.

**Note:** n will be less than 15,000.

**Example 1:**
<pre>
<b>Input:</b> [1, 2, 3, 4]

<b>Output:</b> False

<b>Explanation:</b> There is no 132 pattern in the sequence.
</pre>

**Example 2:**
<pre>
<b>Input:</b> [3, 1, 4, 2]

<b>Output:</b> True

<b>Explanation:</b> There is a 132 pattern in the sequence: [1, 4, 2].
</pre>

**Example 3:**
<pre>
<b>Input:</b> [-1, 3, 2, 0]

<b>Output:</b> True

<b>Explanation:</b> There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
</pre>
