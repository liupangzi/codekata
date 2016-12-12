### 1272.Hidden Message

Some texts contain hidden messages. In the context of this problem, the hidden message of a text is composed of the first letter from each word in the text, in the order they appear.

Given a text consisting of only lowercase letters and spaces, return the hidden message. A word is a maximal sequence of consecutive letters. There may be multiple spaces between words. The text may start in spaces, end in spaces or even contain spaces only.

**Input**

The input contains many test cases. The first line contains an integer **N** that indicates the number of test cases. Each test case consists of a single line containing from 1 to 50 characters, that can be lowercase letters (‘a’-‘z’) or spaces (‘ ’). Watch out for leading and trailing spaces!

Note: In the sample imput, spaces were replaced by small dots (‘·’) to provide a better understanding of the samples.

**Output**

For each test case print the text that is hidden in the input.

| Input Sample | Output Sample |
| ------------ | ------------- |
|      4       |               |
| compete·online·design·event·rating | coder |
| ··u····r·i··o····n·l··i····n··e··· | urionline |
| · |  |
| round··elimination·during··onsite··contest | redoc |
