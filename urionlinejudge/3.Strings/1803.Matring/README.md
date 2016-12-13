### 1803.Matring

Matring is a mix of Matrix and String. It was developed by UNILA (Union of Nerds for Integration of Logic and Adventure) to keep messages safe from eavesdropping.

The first and last column of a matring keep the key to translate it to the real message. The remaining columns of a matring represent an ASCII-coded string, one column per character.

For a *N*-character long message, the corresponding matring is a 4x(*N*+2) matrix of digits. Each column is read as a 4-digit number; a top to bottom sequence of digits is the same as a left to right sequence in horizontal.

Let the first number be *F*, the last number be *L* and the remaining ones to be a sequence of numbers <i>M<sub>i</sub></i>, where 1 ≤ *i* ≤ *N*. The first column of a matring is indexed as zero.

To decode a matring to an string, we must calculate: <i>C<sub>i</sub> = (F * M<sub>i</sub> + L)</i> mod 257, where C<sub>i</sub> is the ASCII-coded character of the original message at position *i*.

Your task is to develop an algorithm to decode matrings.

**Input**

The input is a matring, i.e. a 4x(**N**+2) matrix of digits (from 0 to 9), 0 < **N** < 80.

**Output**

The output is given in one single line and is the decoded string. Include the end-of-line character after the string.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 41805<br>99934<br>39127<br>23659 | OBI |
| 5686702<br>0531447<br>5115038<br>2795214 | UNILA |
| 28665943<br>68409984<br>86877400<br>51804393 | Hodor! |
