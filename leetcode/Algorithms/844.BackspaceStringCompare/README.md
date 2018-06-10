Given two strings `S` and `T`, return if they are equal when both are typed into empty text editors. `#` means a backspace character.

**Example 1:**

<pre>
<b>Input:</b> S = "ab#c", T = "ad#c"
<b>Output:</b> true
<b>Explanation:</b> Both S and T become "ac".
</pre>

**Example 2:**

<pre>
<b>Input:</b> S = "ab##", T = "c#d#"
<b>Output:</b> true
<b>Explanation:</b> Both S and T become "".
</pre>

**Example 3:**

<pre>
<b>Input:</b> S = "a##c", T = "#a#c"
<b>Output:</b> true
<b>Explanation:</b> Both S and T become "c".
</pre>

**Example 4:**

<pre>
<b>Input:</b> S = "a#c", T = "b"
<b>Output:</b> false
<b>Explanation:</b> S becomes "c" while T becomes "b".
</pre>

**Note**:

1. `1 <= S.length <= 200`
2. `1 <= T.length <= 200`
3. `S` and `T` only contain lowercase letters and `'#'` characters.

### [Editorial](https://leetcode.com/articles/backspace-string-compare/)
