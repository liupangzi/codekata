Imagine you have a special keyboard with the following keys:

`Key 1: (A)`: Prints one 'A' on screen.

`Key 2: (Ctrl-A)`: Select the whole screen.

`Key 3: (Ctrl-C)`: Copy selection to buffer.

`Key 4: (Ctrl-V)`: Print buffer on screen appending it after what has already been printed.

Now, you can only press the keyboard for **N** times (with the above four keys), find out the maximum numbers of 'A' you can print on screen.

**Example 1:**
<pre>
<b>Input:</b> N = 3
<b>Output:</b> 3
<b>Explanation:</b> 
We can at most get 3 A's on screen by pressing following key sequence:
A, A, A
</pre>

**Example 2:**
<pre>
<b>Input:</b> N = 7
<b>Output:</b> 9
<b>Explanation:</b>
We can at most get 9 A's on screen by pressing following key sequence:
A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V
</pre>

**Note:**
 1. 1 <= N <= 50
 2. Answers will be in the range of 32-bit signed integer.
