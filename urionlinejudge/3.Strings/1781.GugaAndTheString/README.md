### 1781.Guga and the String

Guga has a string S containing only lowercase letters and he wants to do some operations in it. Each operation can be one of the following types:

 - 0 x, move each vowel in S x positions from left to right. (starting again at the beginning if necessary)
 - 1 x, move each consonant in S x positions from left to right. (starting again at the beginning if necessary)
 - 2, print S as it is

The vowels we are considering are the letters *a*, *e*, *i*, *o* and *u*.

An operation of type 0 only moves vowels through positions in S that contain vowels.

An operation of type 1 only moves consonants through positions in S that contain consonants.


For example,

The string “computador” after the operation 1 2 turns into “dorcumapot”, that is, each consonant goes to the position of the next second consonant.

The string “abe” after the operation 0 1 turns into “eba”.

**Input**

The first line of input contains an integer **T** (1 ≤ **T** ≤ 100), the number of test cases. The first line of each test case contains **S** (1 ≤ |**S**| ≤ 10<sup>4</sup>), Guga’s string. The second line of input contains an integer **Q** (1 ≤ **Q** ≤ 10<sup>5</sup>), the number of operations Guga is going to do in **S**. Each of the following **Q** lines contains an operations as described above. For each operation, 0 ≤ **x** ≤ |**S**|.

**Output**

For each test case print “Caso #**X**:”, where **X** is the number of the current case, starting at 1. For each operation of type 2, print in a new line with the string **S** after all previous operations have been applied on it. The output file contains around 3*10<sup>6</sup> characters.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 2 |       0        |
| computador<br>2<br>0 2<br>2 | Caso #1:<br>campotodur |
| abecidfugh<br>4<br>2<br>0 2<br>1 3<br>2 | Caso #2:<br>abecidfugh<br>ifugahbecd |
