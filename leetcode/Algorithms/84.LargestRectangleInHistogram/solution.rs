use std::cmp::max;

impl Solution {
    pub fn largest_rectangle_area(heights: Vec<i32>) -> i32 {
        let mut stack: Vec<(usize, &i32)> = Vec::new();

        let mut backward: Vec<usize> = Vec::with_capacity(heights.len());
        for i in 0..heights.len() {
            while !stack.is_empty() && stack.get(stack.len() - 1).unwrap().1 >= heights.get(heights.len() - 1 - i).unwrap() {
                stack.pop();
            }

            if stack.is_empty() {
                backward.push(heights.len() - 1);
            } else {
                backward.push(stack.get(stack.len() - 1).unwrap().0 - 1);
            }

            stack.push((heights.len() - 1 - i, heights.get(heights.len() - 1 - i).unwrap()));
        }

        stack = Vec::new();
        let mut forward: Vec<usize> = Vec::with_capacity(heights.len());
        for j in 0..heights.len() {
            while !stack.is_empty() && stack.get(stack.len() - 1).unwrap().1 >= heights.get(j).unwrap() {
                stack.pop();
            }

            if stack.is_empty() {
                forward.push(0);
            } else {
                forward.push(stack.get(stack.len() - 1).unwrap().0);
            }

            stack.push((j + 1, heights.get(j).unwrap()));
        }

        let mut result: i32 = 0;
        for k in 0..heights.len() {
            result = max(result, heights[k] * (1 + (k - forward[k]) as i32 + (backward[heights.len() - 1 - k] - k) as i32));
        }
        return result;
    }
}
