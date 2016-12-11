### 1248.Diet Plan

The doctor has given you your diet, in which each character corresponds to some food that you should eat. You also know what you have eaten for breakfast and lunch, in which each character corresponds to a type of food that you have already eaten that day. You have decided that you will eat all of the remaining food in your diet during dinner, and you want to print that as a String (sorted in alphabetical order). If you have cheated in anyway (either by eating too much of one type of food, or by eating some food that is not in the dietPlan), you should print the String "CHEATER" (quotes for clarity).

**Input**

Input contains several test cases. The first line of input contains an integer **N** that represents the number of test cases. Each test cases is composed by three strings, each of them in a separated line and representing food from diet, breakfast and lunch, respectively. Each string will contain from 0 to 26 (`'A'`-`'Z'`), and can be empty.

**Output**

For each test case print a string that represents food should eat during your dinner, or the string `"CHEATER"` if you have cheated during your diet.


| Input Sample | Output Sample |
| ------------ | ------------- |
| 5 |   |
| ABCD<br>AB<br>C | D |
| ABEDCS<br><br><br> | ABCDES |
| EDSMB<br>MSD<br>A | CHEATER |
| <br><br><br> |  |
| IWANTSODER<br>SOW<br>RAT | DEIN |
