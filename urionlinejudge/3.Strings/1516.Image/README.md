### 1516.Image

Rafael found a new hobbie: to draw using keyboard characters. Even this new kind of art being simple and limited, creativity is enough to make some really cool kind of drawings.

After making a few drawings, Rafael wondered how they would be if they were resized, but having to remake all the drawing looked kind of tiring. For that, he asked your help.

When you want to resize something, one image of **N** lines and **M** columns will have **A** lines and **B** columns, and, given that the new dimensions are bigger than the dimensions of the original image, some characters will have to repeat itself.

Let's say that **A** is 3 times bigger than **N**. In this case, each line will have to repeat 3 times, so the image is resized correctly.

Given a drawing made by Rafael, print how the drawing would be if it was resized to a new given dimension.

**Input**

There will be several test cases. Each test case starts with two integers **N** and **M** (1 ≤ **N**, **M** ≤ 50), representing, repectively, the height and the width of Rafael's drawing.

Following there will be **N** lines, each containing **M** characters, representing the drawing made by Rafael. After, there will be two integers **A** and **B** (**N** < **A** ≤ 100, **M** < **B** ≤ 100, **A** is multiple of **N**, and **B** is multiple of **M**), representing, repectively, the new height and width that Rafael wants his drawing to have.

The last test case is indicated when **N** = **M** = 0, which should not be processed.

**Output**

For each test case, print **A** lines, containing **B** characters each, representing the resized Rafael's drawing.

After each test case, print one blank line.

| Input Sample | Output Sample |
| ------------ | ------------- |
| 3 3<br>`###`<br>`#__`<br>`###`<br>6 9 | `#########`<br>`#########`<br>`###______`<br>`###______`<br>`#########`<br>`#########`<br> |
| 0 0 |  |
