You have `k` lists of sorted integers in ascending order. Find the **smallest** range that includes at least one number from each of the `k` lists.

We define the range [a,b] is smaller than range [c,d] if `b-a < d-c` or `a < c` if `b-a == d-c`.

**Example 1:**
<pre>
<b>Input:</b> [[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
<b>Output:</b> [20,24]
<b>Explanation</b>:
List 1: [4, 10, 15, 24,26], 24 is in range [20,24].
List 2: [0, 9, 12, 20], 20 is in range [20,24].
List 3: [5, 18, 22, 30], 22 is in range [20,24].
</pre>

**Note:**
 1. The given list may contain duplicates, so ascending order means >= here.
 2. 1 <= `k` <= 3500.
 3. -10<sup>5</sup> <= `value of elements` <= 10<sup>5</sup>.

### [Editorial](https://leetcode.com/articles/smallest-range/)
