There are *n* bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the *i*th round, you toggle every *i* bulb. For the *n*th round, you only toggle the last bulb. Find how many bulbs are on after *n* rounds.

**Example:**

<pre>
Given <i>n</i> = 3. 

At first, the three bulbs are <b>[off, off, off]</b>.
After first round, the three bulbs are <b>[on, on, on]</b>.
After second round, the three bulbs are <b>[on, off, on]</b>.
After third round, the three bulbs are <b>[on, off, off]</b>. 

So you should return 1, because there is only one bulb is on.
</pre>
