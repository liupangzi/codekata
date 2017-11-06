We have two special characters. The first character can be represented by one bit `0`. The second character can be represented by two bits (`10` or `11`).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.

**Example 1:**
<pre>
<b>Input:</b>
bits = [1, 0, 0]
<b>Output:</b> True
<b>Explanation:</b>
The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
</pre>

**Example 2:**
<pre>
<b>Input:</b>
bits = [1, 1, 1, 0]
<b>Output:</b> False
<b>Explanation:</b>
The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.
</pre>

**Note:**

- `1 <= len(bits) <= 1000`.
- `bits[i]` is always `0` or `1`.

### [Editorial](https://leetcode.com/articles/1-bit-and-2-bit-characters/)
