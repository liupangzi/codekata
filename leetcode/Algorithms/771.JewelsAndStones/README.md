You're given strings `J` representing the types of stones that are jewels, and `S` representing the stones you have.  Each character in `S` is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in `J` are guaranteed distinct, and all characters in `J` and `S` are letters. Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

**Example 1:**
<pre>
<b>Input:</b> J = "aA", S = "aAAbbbb"
<b>Output:</b> 3
</pre>

**Example 2:**
<pre>
<b>Input:</b> J = "z", S = "ZZ"
<b>Output:</b> 0
</pre>

**Note:**

 - `S` and `J` will consist of letters and have length at most 50.
 - The characters in `J` are distinct.

### [Editorial](https://leetcode.com/articles/jewels-and-stones/)
