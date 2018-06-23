In a row of `seats`, `1` represents a person sitting in that seat, and `0` represents that the seat is empty. 

There is at least one empty seat, and at least one person sitting.

Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 

Return that maximum distance to closest person.

**Example 1:**

<pre>
<b>Input:</b> [1,0,0,0,1,0,1]
<b>Output:</b> 2
<b>Explanation:</b> 
If Alex sits in the second open seat (seats[2]), then the closest person has distance 2.
If Alex sits in any other open seat, the closest person has distance 1.
Thus, the maximum distance to the closest person is 2.
</pre>

**Example 2:**

<pre>
<b>Input:</b> [1,0,0,0]
<b>Output:</b> 3
<b>Explanation:</b> 
If Alex sits in the last seat, the closest person is 3 seats away.
This is the maximum distance possible, so the answer is 3.
</pre>

**Note:**

1. `1 <= seats.length <= 20000`
2. `seats` contains only 0s or 1s, at least one `0`, and at least one `1`.

### [Editorial](https://leetcode.com/articles/maximize-distance-to-closest-person/)
