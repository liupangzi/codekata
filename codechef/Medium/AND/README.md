










You are given a sequence of **N** integer numbers **A**. Calculate the sum of <b>A<sub>i</sub> AND A<sub>j</sub></b> for all the pairs (**i**, **j**) where **i** < **j**.

The **AND** operation is the **Bitwise AND** operation, defined as in [here][1].

### **Input**

The first line of input consists of the integer **N**. 

The second line contains **N** integer numbers - the sequence **A**.

### **Output**

Output the answer to the problem on the first line of the output.

### **Example**

**Input**

```
5
1 2 3 4 5
```

**Output**

```
9
```

### **Scoring**

Subtask 1 (13 points): **N** <= 1000, <b>A<sub>i</sub></b> <= 1.

Subtask 2 (39 points): **N** <= 1000, <b>A<sub>i</sub></b> <= 109.

Subtask 3 (21 points): **N** <= 105, <b>A<sub>i</sub></b> <= 1.

Subtask 4 (27 points): **N** <= 105, <b>A<sub>i</sub></b> <= 106.


  [1]: https://en.wikipedia.org/wiki/Bitwise_operation#AND
