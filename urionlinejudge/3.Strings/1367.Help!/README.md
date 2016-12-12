### 1367.Help!

Well, we have to admit: we need your help. This year things have not been running as smoothly as we wished, and we could not finish the contest system software in time. One vital part is missing, and as you know, we need the system working by this afternoon, for the real contest. The missing part is the module that computes the team’s scores, given the team’s list of submissions. Please, please, someone help us!

**Input**

The input contains several test cases. The first line of a test case contains a single integer N indicating the number of submissions in the test (1 ≤ **N** ≤ 300). Each of the following **N** lines describe a submission; each of these lines contains a problem identifier (a single letter from ’A’ to ’Z’), followed by an integer **T** representing the time in minutes (0 ≤ **T** ≤ 300), followed by a judgement (the word “correct” or the word “incorrect”). The input is in ascending order by time, and there will be at most one “correct” judgement for each problem. The end of input is indicated by **N** = 0. The input must be read from standard input.

**Output**

For each test case in the input your program should output a line containing two integers **S** and **P** , separated by a space, where **S** is the number of distinct problems with a “correct” judgement and **P** is the time at which each distinct problem is first judged “correct”, plus 20 for each “incorrect” submission for a problem that is later judged “correct”. The output must be written to standard output.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 3<br>A 120 incorrect<br>A 130 incorrect<br>A 200 incorrect | 0 0 |
| 5<br>A 100 correct<br>B 110 incorrect<br>B 111 correct<br>C 200 correct<br>D 300 incorrect | 3 431 |
| 0 |  |
