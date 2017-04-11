# Beautiful Arrays #

An array **a** is called *beautiful* if for every pair of numbers **a<sub>i</sub>**, **a<sub>j</sub>**, (**i ≠ j**), there exists an **a<sub>k</sub>** such that **a<sub>k</sub> = a<sub>i</sub> * a<sub>j</sub>**. Note that **k** can be equal to **i** or **j** too.

Find out whether the given array **a** is *beautiful* or not!

<hr>

### Input ###
First line of the input contains an integer **T** denoting the number of test cases. **T** test cases follow.

First line of each test case contains an integer **n** denoting number of elements in **a**.

Next line contains **n** space separated integers denoting the array **a**.

<hr>

### Output ###

For each test case, output a single line containing "yes" or "no" (without quotes) corresponding to the answer of the problem.

<hr>

### Constraints ###

 - **1 ≤ T ≤ 10<sup>6</sup>**
 - **1 ≤ n ≤ 10<sup>5</sup>**
 - Sum of **n** over all the test cases ≤ **10<sup>6</sup>**
 - **-10<sup>9</sup> ≤ a<sub>i</sub> ≤ 10<sup>9</sup>**

<hr>

### Example ###

<pre>
<b>Input:</b>
3
2
0 1
2
1 2
2
5 6

<b>Output:</b>
yes
yes
no
</pre>

<hr>

### Explanation ###

**Test case 1.** If you multiply 0 with 1, you get 0, we see that **a<sub>0</sub> = 0**. So, the array is beautiful.

**Test case 3.** If you multiply 5 with 6, you get 30, there does not exist an **k** such that **a<sub>k</sub> = 30**. So, the array is not *beautiful*.
