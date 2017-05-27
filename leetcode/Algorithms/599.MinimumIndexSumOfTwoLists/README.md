Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their **common interest** with the **least list index sum**. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

**Example 1:**
<pre>
<b>Input:</b>
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
<b>Output:</b> ["Shogun"]
<b>Explanation:</b> The only restaurant they both like is "Shogun".
</pre>

**Example 2:**
<pre>
<b>Input:</b>
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
<b>Output:</b> ["Shogun"]
<b>Explanation:</b> The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
</pre>

**Note:**

 1. The length of both lists will be in the range of [1, 1000].
 2. The length of strings in both lists will be in the range of [1, 30].
 3. The index is starting from 0 to the list length minus 1.
 4. No duplicates in both lists.

### [Editorial](https://leetcode.com/articles/minimum-index-sum-of-two-lists/)
