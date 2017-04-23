Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

**Example 1:**
<pre>
<b>Input:</b>
s = "abpcplea", d = ["ale","apple","monkey","plea"]

<b>Output:</b> 
"apple"
</pre>

**Example 2:**

<pre>
<b>Input:</b>
s = "abpcplea", d = ["a","b","c"]

<b>Output:</b> 
"a"
</pre>

**Note:**

 1. All the strings in the input will only contain lower-case letters.
 2. The size of the dictionary won't exceed 1,000.
 3. The length of all the strings in the input won't exceed 1,000.
