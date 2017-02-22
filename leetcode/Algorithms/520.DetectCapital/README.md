Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

 1. All letters in this word are capitals, like "USA".
 2. All letters in this word are not capitals, like "leetcode".
 3. Only the first letter in this word is capital if it has more than one letter, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way.

**Example 1:**
<pre>
<b>Input:</b> "USA"
<b>Output:</b> True
</pre>

**Example 2:**
<pre>
<b>Input:</b> "FlaG"
<b>Output:</b> False
</pre>

**Note:** The input will be a non-empty word consisting of uppercase and lowercase latin letters.
