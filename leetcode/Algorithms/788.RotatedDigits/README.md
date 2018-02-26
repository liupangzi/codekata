X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X. A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number.

Now given a positive number `N`, how many numbers X from `1` to `N` are good?

<pre>
<b>Example:</b>
<b>Input:</b> 10
<b>Output:</b> 4
<b>Explanation:</b>
There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
</pre>

**Note:**

 - N  will be in range `[1, 10000]`.

### [Editorial](https://leetcode.com/articles/rotated-digits/)
