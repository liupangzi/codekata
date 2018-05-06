In a string `S` of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like `S = "abbxxxxzyy"` has the groups `"a"`, `"bb"`, `"xxxx"`, `"z"` and `"yy"`.

Call a group *large* if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

 
**Example 1:**
<pre>
<b>Input:</b> "abbxxxxzzy"
<b>Output:</b> [[3,6]]
<b>Explanation:</b> "xxxx" is the single large group with starting  3 and ending positions 6.
</pre>

**Example 2:**
<pre>
<b>Input:</b> "abc"
<b>Output:</b> []
<b>Explanation:</b> We have "a","b" and "c" but no large group.
</pre>

**Example 3:**
<pre>
<b>Input:</b> "abcdddeeeeaabbbcd"
<b>Output:</b> [[3,5],[6,9],[12,14]]
</pre>

**Note:**  `1 <= S.length <= 1000`

### [Editorial](https://leetcode.com/articles/positions-of-large-groups/)
