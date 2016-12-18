The [Hamming distance][1] between two integers is the number of positions at which the corresponding bits are different.

Now your job is to find the total Hamming distance between all pairs of the given numbers.

**Example:**

<pre>
<b>Input:</b> 4, 14, 2

<b>Output:</b> 6

<b>Explanation:</b> In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just
showing the four bits relevant in this case). So the answer will be:
HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
</pre>

**Note:**

 1. Elements of the given array are in the range of `0` to <code>10<sup>9</sup></code>;
 2. Length of the array will not exceed <code>10<sup>4</sup></code>.


  [1]: https://en.wikipedia.org/wiki/Hamming_distance
