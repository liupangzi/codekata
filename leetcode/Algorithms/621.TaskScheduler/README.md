Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks.Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.

However, there is a non-negative cooling interval **n** that means between two **same tasks**, there must be at least n intervals that CPU are doing different tasks or just be idle.

You need to return the **least** number of intervals the CPU will take to finish all the given tasks.

**Example 1:**
<pre>
<b>Input:</b> tasks = ['A','A','A','B','B','B'], n = 2
<b>Output:</b> 8
<b>Explanation:</b> A -> B -> idle -> A -> B -> idle -> A -> B.
</pre>

**Note:**

 1. The number of tasks is in the range [1, 10000].
 2. The integer n is in the range [0, 100].

### [Editorial](https://leetcode.com/articles/task-scheduler/)
