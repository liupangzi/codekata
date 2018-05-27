There are `N` rooms and you start in room `0`.  Each room has a distinct number in `0, 1, 2, ..., N-1`, and each room may have some keys to access the next room. 

Formally, each room `i` has a list of keys `rooms[i]`, and each key `rooms[i][j]` is an integer in `[0, 1, ..., N-1]` where `N = rooms.length`.  A key `rooms[i][j] = v` opens the room with number `v`.

Initially, all the rooms start locked (except for room `0`). 

You can walk back and forth between rooms freely.

Return `true` if and only if you can enter every room.


**Example 1:**

<pre>
<b>Input:</b> [[1],[2],[3],[]]
<b>Output:</b> true
<b>Explanation:</b>  
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.
</pre>

**Example 2:**

<pre>
<b>Input:</b> [[1,3],[3,0,1],[2],[0]]
<b>Output:</b> false
<b>Explanation:</b> We can't enter the room with number 2.
</pre>

**Note:**

1. `1 <= rooms.length <= 1000`
2. `0 <= rooms[i].length <= 1000`
3. The number of keys in all rooms combined is at most `3000`.

### [Editorial](https://leetcode.com/articles/keys-and-rooms/)
