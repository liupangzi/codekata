use std::collections::VecDeque;

impl Solution {
    pub fn max_sliding_window(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut deque: VecDeque<(usize, i32)> = VecDeque::new();
        let mut result = Vec::new();
        for i in 0..nums.len() {
            while !deque.is_empty() && deque.back().unwrap().1 <= nums[i] {
                deque.pop_back();
            }
            deque.push_back((i, nums[i]));

            if deque.front().unwrap().0 + (k as usize) <= i {
                deque.pop_front();
            }

            if i + 1 >= k as usize {
                result.push(deque.front().unwrap().1);
            }
        }
        return result;
    }
}
