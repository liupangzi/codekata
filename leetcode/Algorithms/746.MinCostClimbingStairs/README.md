On a staircase, the `i-`th step has some non-negative cost `cost[i]` assigned (0 indexed).

Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.

**Example 1:**
<pre>
<b>Input:</b> cost = [10, 15, 20]
<b>Output:</b> 15
<b>Explanation:</b> Cheapest is start on cost[1], pay that cost and go to the top.
</pre>

**Example 2:**
<pre>
<b>Input:</b> cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
<b>Output:</b> 6
<b>Explanation:</b> Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
</pre>

**Note:**

 1. `cost` will have a length in the range `[2, 1000]`.
 2. Every `cost[i]` will be an integer in the range `[0, 999]`.
 
### [Editorial](https://leetcode.com/articles/min-cost-climbing-stairs/)
