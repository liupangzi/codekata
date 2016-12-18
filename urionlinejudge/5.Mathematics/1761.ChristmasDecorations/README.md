### 1761.Christmas Decorations

This Christmas, Santa Claus appointed some of his most dedicated elves to decorate the yard in the present manufacturing at the North Pole. The yard has several pine trees of various sizes. Santa Claus instructed the elves to decorate a tree with string of lights, their size should be 5 times the size of the tree.

To find the height of each tree, Santa Claus gave them an old theodolite (instrument used to measure angles) and ordered them to use trigonometric concepts to find the height of each tree.

Your task is to help the elves to find a way to calculate the amount of string of lights needed for each tree.

Consider for this challenge that the theodolite is positioned at the height of each elf and that this point needs to be computed. The theodolite inform values in degrees. In this problem consider PI as 3.141592654.

**Input**

The input is composed by several test cases. Each test case consists of a double value **A** that is the angle calculated by the theodolite (1.00 < **A** < 90.00), a value double **B** (1 ≤ **B** ≤ 100) corresponding to the distance between the theodolite and the tree and a value double **C** (0.50 ≤ **C** ≤ 1.50) which is the height in metres of the elf who is measuring the angle. The end of input is determined by EOF.

**Output**

You should show the amount string of lights needed to adorn each tree. Note: Decimal values should be rounded to 2 decimal places.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 57.25 57.34 0.98 | 450.63 |
| 54.83 46.49 1.47 | 337.24 |
| 36.23 19.29 1.46 | 77.97 |
