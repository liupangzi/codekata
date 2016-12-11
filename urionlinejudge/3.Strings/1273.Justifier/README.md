### 1273.Justifier

We have some words and we want to right justify them, that is, align them to the right. Create a program that reads a word and print it all right justified, in the same order as they appear in the input.

**Input**

The input contains several test cases. The first line of a test case will contain an integer **N** (1 ≤ **N** ≤ 50) indicating the number of following words. Each word is composed of up to 50 uppercase letters (‘A’-‘Z’) and will contain at least one letter. The end of input is indicated by **N** = 0.

**Output**

For each test case print the words padded on the left with space characters so that they are all the same length as the longest word found in that text. Print an empty line between all the test cases. There must be no trailing spaces printed out, and you should discard any unnecessary leading spaces, so that at least one line on every output word starts with a letter.

| Input Sample | Output Sample |
| ------------ | ------------: |
| 3<br>BOB<br>TOMMY<br>JIM | BOB<br>TOMMY<br>JIM |
| 4<br>JOHN<br>JAKE<br>ALAN<br>BLUE | JOHN<br>JAKE<br>ALAN<br>BLUE |
| 4<br>LONGEST<br>A<br>LONGER<br>SHORT | LONGEST<br>A<br>LONGER<br>SHORT |
|0||
