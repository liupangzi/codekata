We are given two strings, `A` and `B`.

A *shift on `A`* consists of taking string `A` and moving the leftmost character to the rightmost position. For example, if `A = 'abcde'`, then it will be `'bcdea'` after one shift on `A`. Return `True` if and only if `A` can become `B` after some number of shifts on `A`.

<pre>
<b>Example 1:</b>
<b>Input:</b> A = 'abcde', B = 'cdeab'
<b>Output:</b> true

<b>Example 2:</b>
<b>Input:</b> A = 'abcde', B = 'abced'
<b>Output:</b> false
</pre>

**Note:**

- `A` and `B` will have length at most `100`.

### [Editorial](https://leetcode.com/articles/rotate-string/)
