We are stacking blocks to form a pyramid. Each block has a color which is a one letter string, like `'Z'`.

For every block of color `C` we place not in the bottom row, we are placing it on top of a left block of color `A` and right block of color `B`. We are allowed to place the block there only if `(A, B, C)` is an allowed triple.

We start with a bottom row of `bottom`, represented as a single string. We also start with a list of allowed triples `allowed`. Each allowed triple is represented as a string of length 3.

Return true if we can build the pyramid all the way to the top, otherwise false.

**Example 1:**
<pre>
<b>Input:</b> bottom = "XYZ", allowed = ["XYD", "YZE", "DEA", "FFF"]
<b>Output:</b> true
<b>Explanation:</b>
We can stack the pyramid like this:
    A
   / \
  D   E
 / \ / \
X   Y   Z

This works because ('X', 'Y', 'D'), ('Y', 'Z', 'E'), and ('D', 'E', 'A') are allowed triples.
</pre>

**Example 2:**
<pre>
<b>Input:</b> bottom = "XXYX", allowed = ["XXX", "XXY", "XYX", "XYY", "YXZ"]
<b>Output:</b> false
<b>Explanation:</b>
We can't stack the pyramid to the top.
Note that there could be allowed triples (A, B, C) and (A, B, D) with C != D.
</pre>

**Note:**

 1. `bottom` will be a string with length in range `[2, 12]`.
 2. `allowed` will have length in range `[0, 343]`.
 3. Letters in all strings will be chosen from the set `{'A', 'B', 'C', 'D', 'E', 'F', 'G'}`.

### [Editorial](https://leetcode.com/articles/pyramid-transition-matrix/)
