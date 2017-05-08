Consider the string `s` to be the infinite wraparound string of "abcdefghijklmnopqrstuvwxyz", so `s` will look like this: "...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....".

Now we have another string `p`. Your job is to find out how many unique non-empty substrings of `p` are present in `s`. In particular, your input is the string `p` and you need to output the number of different non-empty substrings of `p` in the string `s`.

**Note:** `p` consists of only lowercase English letters and the size of p might be over 10000.

**Example 1:**
<pre>
<b>Input:</b> "a"
<b>Output:</b> 1
<b>Explanation:</b> Only the substring "a" of string "a" is in the string strings.
</pre>

**Example 2:**
<pre>
<b>Input:</b> "cac"
<b>Output:</b> 2
<b>Explanation:</b> There are two substrings "a", "c" of string "cac" in the string s.
</pre>

**Example 3:**
<pre>
<b>Input:</b> "zab"
<b>Output:</b> 6
<b>Explanation:</b> There are six substrings "z", "a", "b", "za", "ab", "zab" of string "zab" in the string s.
</pre>
