### 2356.Bacteria I

Dr. Henrique really loves your research with bacteria. He tried make an antibiotic resistant bacteria, and when evaluate the DNA, he noticed similarity of the bacteria that are more resistant than the others. All of them have the same part of its genetic code (composed of proteins A, C, G, T). Therefore, Dr. Henrique realized that part of code define if a bacteria is resistant or not. So, Dr. Henrique ask you to make a program that evaluate if a bacteria is resistant given its DNA and the part of genetic code that gives antibiotic resistance.

**Input**

Each test case have two strings, **D** and **S**, each one in a line, and represent the DNA of bacteria and the genetic code that gives antibiotic resistance. 1 ≤ |**D**|, |**S**| ≤ 100. The strings are composed by characters: A, C, G, T.

**Output**

Output one line for each test case, having the string "Resistente" (without quote) if the bacteria have the genetic code required in its DNA, or the string "Nao resistente" (without quote) otherwise.


| Input Sample | Output Sample |
| ------------ | ------------- |
| ACGTC |  |
| CGT | Resistente |
| CCCT |  |
| AG | Nao resistente |
