Given a 2D matrix *matrix*, find the sum of the elements inside the rectangle defined by its upper left corner (*row1*, *col1*) and lower right corner (*row2*, *col2*).

<img src="https://leetcode.com/static/images/courses/range_sum_query_2d.png" alt="Range Sum Query 2D">

<small>The above rectangle (with the red border) is defined by (row1, col1) = **(2, 1)** and (row2, col2) = **(4, 3)**, which contains sum = **8**.</small>

**Example:**
```
Given matrix = [
  [3, 0, 1, 4, 2],
  [5, 6, 3, 2, 1],
  [1, 2, 0, 1, 5],
  [4, 1, 0, 1, 7],
  [1, 0, 3, 0, 5]
]

sumRegion(2, 1, 4, 3) -> 8
sumRegion(1, 1, 2, 2) -> 11
sumRegion(1, 2, 2, 4) -> 12
```

**Note:**

 1. You may assume that the matrix does not change
 2. There are many calls to *sumRegion* function.
 3. You may assume that *row1* ≤ *row2* and *col1* ≤ *col2*.

### [Editorial](https://leetcode.com/articles/range-sum-query-2d-immutable/)
