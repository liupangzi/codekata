### 1262.Multiple Reading

In many computer systems, multiple processes can read from the same resource during the same clock cycle, but only a single process can write to the resource during a clock cycle. Reads and writes cannot be mixed during the same clock cycle. Given a history of the reads and writes that occurred during a particular computation as a String **trace**, and an int **procs** representing the number of processes used by the computation, calculate the minimum duration of the computation in clock cycles. The **trace** represents each read as an `'R'` and each write as a `'W'`.

For example, if **trace** is `"RWWRRR"` and **procs** is `3`, then the minimum number of clock cycles is 4: one for the first read, one each for the two writes, and one for the last group of reads.

**Input**

The input contains several test cases. Each test case is composed by two lines. The first line has a string made out of 1 to 50 characters, where each can be either `'R'` or `'W'`. The second line contains an integer **P** (1 ≤ **P** ≤ 10), which represents the number of processes as a direct indicator of how many read operations can be performed simultaneously. The input stream ends in EOF.

**Output**

For each test case determine and print the minimum number of clock cycles required to run the given **trace**. For further reference see the examples below.


| Input Sample | Output Sample |
| ------------ | ------------- |
| RWWRRR<br>3  | 4 |
| RWWRRRR<br>3  | 5 |
| WWWWW<br>5  | 5 |
| RRRRRRRRRR<br>4 | 3 |
| RWRRWWRWRWRRRWWRRRRWRRWRRWRRRRRRRRRWRWRWRRRRWRRRRR<br>4 | 30 |
