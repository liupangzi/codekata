Given an array of characters, compress it [in-place][1].

The length after compression must always be smaller than or equal to the original array.

Every element of the array should be a **character** (not int) of length 1.

After you are done **modifying the input array** [in-place][1], return the new length of the array.


**Follow up:**
Could you solve it using only O(1) extra space?


**Example 1:**
<pre>
<b>Input:</b>
["a","a","b","b","c","c","c"]

<b>Output:</b>
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

<b>Explanation:</b>
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
</pre>

**Example 2:**
<pre>
<b>Input:</b>
["a"]

<b>Output:</b>
Return 1, and the first 1 characters of the input array should be: ["a"]

<b>Explanation:</b>
Nothing is replaced.
</pre>

**Example 3:**
<pre>
<b>Input:</b>
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

<b>Output:</b>
Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

<b>Explanation:</b>
Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
Notice each digit has it's own entry in the array.
</pre>

**Note:**

 1. All characters have an ASCII value in `[35, 126]`.
 2. `1 <= len(chars) <= 1000`.


  [1]: https://en.wikipedia.org/wiki/In-place_algorithm
  
### [Editorial](https://leetcode.com/articles/string-compression/)
