### 1287.Friendly Int Parser

Computers have made their way into a significant percentage of the homes in the world, and as programmers we are responsible for designing user interfaces that everyone can use. User interfaces need to be flexible so that if a user makes some non-fatal error, the interface can still figure out what the user meant.

Your task is to write a program which processes a text input representing an integer, however, because this is a friendly user interface, we cut the user a little more slack:

 1. If the user types the letter `"O"` or `"o"`, we assume that they meant the digit `"0"`.
 2. If the user types the letter `"l"`, we assume that they meant the digit `"1"`.
 3. Commas and spaces are allowed, but are not processed (ignore them).

If the user has still not entered a valid non-negative integer (even with the rules above), print the string "error". Overflow (a value greater than 2147483647) is considered invalid and "error" should be printed.

**Input**

Each line of input is one test case and contains one string n. This n will contain between 0 and 50, inclusive, letters, numbers, spaces, or commas.

**Output**

For each test case in the input, your program must print the integer represented by n or "error" if n is not a valid non-negative integer. 

Note: an empty string does not represent a valid integer.

| Input Sample | Output Sample |
| ------------ | ------------- |
| lo6 | 106 |
| 234,657 | 234657 |
|  | error |
| hi | error |
| ,,,,,5,,5,    4 | 554 |
| 2200000000 | error |
| 00 | 0 |
