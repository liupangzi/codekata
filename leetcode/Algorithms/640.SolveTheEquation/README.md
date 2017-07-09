Solve a given equation and return the value of `x` in the form of string "x=#value". The equation contains only '+', '-' operation, the variable `x` and its coefficient.

If there is no solution for the equation, return "No solution".

If there are infinite solutions for the equation, return "Infinite solutions".

If there is exactly one solution for the equation, we ensure that the value of `x` is an integer.

**Example 1:**
<pre>
<b>Input:</b> "x+5-3+x=6+x-2"
<b>Output:</b> "x=2"
</pre>

**Example 2:**
<pre>
<b>Input:</b> "x=x"
<b>Output:</b> "Infinite solutions"
</pre>

**Example 3:**
<pre>
<b>Input:</b> "2x=x"
<b>Output:</b> "x=0"
</pre>

**Example 4:**
<pre>
<b>Input:</b> "2x+3x-6x=x+2"
<b>Output:</b> "x=-1"
</pre>

**Example 5:**
<pre>
<b>Input:</b> "x=x+2"
<b>Output:</b> "No solution"
</pre>

### [Editorial](https://leetcode.com/articles/solve-the-equation/)
