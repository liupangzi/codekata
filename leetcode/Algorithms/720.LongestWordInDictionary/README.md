Given a list of strings `words` representing an English Dictionary, find the longest word in `words` that can be built one character at a time by other words in `words`. If there is more than one possible answer, return the longest word with the smallest lexicographical order.

If there is no answer, return the empty string.

**Example 1:**
<pre>
<b>Input:</b>
words = ["w","wo","wor","worl", "world"]
<b>Output:</b> "world"
<b>Explanation:</b>
The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
</pre>

**Example 2:**
<pre>
<b>Input:</b>
words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
<b>Output:</b> "apple"
<b>Explanation:</b>
Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
</pre>

**Note:**

 - All the strings in the input will only contain lowercase letters.
 - The length of `words` will be in the range `[1, 1000]`.
 - The length of `words[i]` will be in the range `[1, 30]`.
 
### [Editorial](https://leetcode.com/articles/longest-word-in-dictionary/)
