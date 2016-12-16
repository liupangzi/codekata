### 1868.Square Spiral

The company Animations Free Fault, or ALF, performs the most diverse animation using only characters on the screen. One day, were challenged to make an animation of a spiral Square. This should do the following: 

 - Always display a square table with N rows and N columns, with a character in its respective place without spaces between them;
 - This number N will always be unique;
 - The first part of this animation will be with an 'X' character at the center of the table and the rest of the same characters busy with 'O';
 - In the charts, the 'X' character will be moved to the other table places, where it was replaced with 'O', always exhibiting since the 'X' in each frame. The offset is in the shape of a square spiral, making the offset to right, up, and down left. Here's an example of all frames of the animation with N = 5:

![Square Spiral][1]

Write a program that, given an integer, print all frames of the animation of the square spiral.

**Input**

There will be several test cases . Each test case starts with an integer N ( 1 ≤ N ≤ 25 ), indicating the size of the screen. The last test case is indicated when N = 0 , and this case should not be processed.

**Output**

For each test case print N x N tables, each separated with '@ ' according to the rules of the animation as described above .

| Input Sample | Output Sample |
| ------------ | ------------- |
| 3 | OOO<br>OXO<br>OOO<br>@<br>OOO<br>OOX<br>OOO<br>@<br>OOX<br>OOO<br>OOO<br>@<br>OXO<br>OOO<br>OOO<br>@<br>XOO<br>OOO<br>OOO<br>@<br>OOO<br>XOO<br>OOO<br>@<br>OOO<br>OOO<br>XOO<br>@<br>OOO<br>OOO<br>OXO<br>@<br>OOO<br>OOO<br>OOX<br>@ |
| 1 | X<br>@ |
| 0 |  |

  [1]: https://urionlinejudge.r.worldssl.net/gallery/images/problems/UOJ_1868.png
