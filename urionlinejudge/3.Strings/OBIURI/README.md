### 2062.OBI URI

Mariazinha created an exercise for her sisters Paula and Marta: she distributes a text and asks both to correct this text, knowing that only the OBI and URI words may be written incorrectly, and the error can be only in the last letter.

Your task here is automatize this process, creating a program to make the correction of the texts distributed by Mariazinha in order to check the corrections of her sisters without much work.

Note that if "OB" or "UR" were part of a larger word (for example, "OBOS"), it should not be altered.

**Input**

The input contains two lines. The first line contain a integer number **N** (1 < **N** < 10000) that indicates the amount of text words. The second line contains these text words, each one with up to 20 characters ('A'-'Z'), inclusive, or at least, one letter ('A'-'Z').

The input contains several test cases. Each test case is composed by one line that contais a string sentence. This string will contain between 1 and 50 characters ('A'-'Z','a'-'z' or space ' '), inclusive, or at least, one letter ('A'-'Z','a'-'z').

**Output**

Your program must correct the text distributed by Mariazinha, according to the criteria above defined.


| Input Sample | Output Sample |
| ------------ | ------------- |
| 2<br>OBO URU | OBI URI |
| 3<br>EURO AVOID OBITS | EURO AVOID OBITS |
| 10<br>URA URO URI URU UROS IBO OBA OBAS OBES OBE | URI URI URI URI UROS IBO OBI OBAS OBES OBI |
