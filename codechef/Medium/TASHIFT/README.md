You are given two strings **A** and **B** of the same length. Each string contains **N** Lower case Latin character (from 'a' to 'z'). A shift operation will remove the first character of a string and add the same character at the end of that string. For example after you perform a shift operation on a string 'abcd', the new string will be 'bcda'. If you perform this operation two times, the new string will be 'cdab'. You need to use some (maybe none) shift operations on the string **B** to maximize the length of the longest common prefix of **A** and **B**. If more than one result can be found pick the one that use smallest number of shift operations.

### **Input**

The first line of the input contains a single integer **N**. The second and the third lind contains the string **A** and **B** respectively.

### **Output**

Contains a single integer which is the number of shift operations.

### **Constraints**

30 points:

 - <b>1 ≤ N ≤ 5000</b>

30 points:

 - <b>1 ≤ N ≤ 10<sup>4</sup></b>

30 points:

 - <b>1 ≤ N ≤ 10<sup>6</sup></b>
  
### **Example**

**Input**

```
5
ccadd
bddcc
```

**Output**

```
3
```
