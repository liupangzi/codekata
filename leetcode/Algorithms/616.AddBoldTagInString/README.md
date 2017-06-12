Given a string **s** and a list of strings **dict**, you need to add a closed pair of bold tag `<b>` and `</b>` to wrap the substrings in s that exist in dict. If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag. Also, if two substrings wrapped by bold tags are consecutive, you need to combine them.

**Example 1:**
<pre>
<b>Input:</b>
s = "abcxyz123"
dict = ["abc","123"]
<b>Output:</b>
"&lt;b&gt;abc&lt;/b&gt;xyz&lt;b&gt;123&lt;/b&gt;"
</pre>

**Example 2:**
<pre>
<b>Input:</b>
s = "aaabbcc"
dict = ["aaa","aab","bc"]
<b>Output:</b>
"&lt;b&gt;aaabbc&lt;/b&gt;c"
</pre>

**Note:**

 1. The given dict won't contain duplicates, and its length won't exceed 100.
 2. All the strings in input have length in range [1, 1000].
 
### [Editorial](https://leetcode.com/articles/add-bold-tag-in-a-string/)
