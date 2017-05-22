Given a string representing an expression of fraction addition and subtraction, you need to return the calculation result in string format. The final result should be [irreducible fraction][1]. If your final result is an integer, say `2`, you need to change it to the format of fraction that has denominator `1`. So in this case, `2` should be converted to `2/1`.

**Example 1:**
<pre>
<b>Input:</b> "-1/2+1/2"
<b>Output:</b> "0/1"
</pre>

**Example 2:**
<pre>
<b>Input:</b> "-1/2+1/2+1/3"
<b>Output:</b> "1/3"
</pre>

**Example 3:**
<pre>
<b>Input:</b> "1/3-1/2"
<b>Output:</b> "-1/6"
</pre>

**Example 4:**
<pre>
<b>Input:</b> "5/3+1/3"
<b>Output:</b> "2/1"
</pre>

**Note:**

 1. The input string only contains `'0'` to `'9'`, `'/'`, `'+'` and `'-'`. So does the output.
 2. Each fraction (input and output) has format `±numerator/denominator`. If the first input fraction or the output is positive, then `'+'` will be omitted.
 3. The input only contains valid **irreducible fractions**, where the **numerator** and **denominator** of each fraction will always be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
 4. The number of given fractions will be in the range [1,10].
 5. The numerator and denominator of the **final result** are guaranteed to be valid and in the range of 32-bit int.

  [1]: https://en.wikipedia.org/wiki/Irreducible_fraction

### [Editorial](https://leetcode.com/articles/kill-process-3/)
