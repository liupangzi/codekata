Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. There is no limit on how many times a digit can be reused.

You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.

**Example 1:**
<pre>
<b>Input:</b> "19:34"
<b>Output:</b> "19:39"
<b>Explanation:</b> The next closest time choosing from digits <b>1</b>, <b>9</b>, <b>3</b>, <b>4</b>, is <b>19:39</b>, which occurs 5 minutes later.  It is not <b>19:33</b>, because this occurs 23 hours and 59 minutes later.
</pre>

**Example 2:**
<pre>
<b>Input:</b> "23:59"
<b>Output:</b> "22:22"
<b>Explanation:</b> The next closest time choosing from digits <b>2</b>, <b>3</b>, <b>5</b>, <b>9</b>, is <b>22:22</b>. It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
</pre>

### [Editorial](https://leetcode.com/articles/next-closest-time/)
