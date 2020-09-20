impl Solution {
    pub fn trap(height: Vec<i32>) -> i32 {
        if height.is_empty() {
            return 0;
        }

        let mut forward: Vec<(usize, &i32)> = Vec::new();
        let mut backward: Vec<(usize, &i32)> = Vec::new();
        for i in 0..height.len() {
            if forward.is_empty() || forward.last().unwrap().1 < height.get(i).unwrap() {
                forward.push((i, height.get(i).unwrap()));
            }

            if backward.is_empty() || backward.last().unwrap().1 < height.get(height.len() - 1 - i).unwrap() {
                backward.push((height.len() - 1 - i, height.get(height.len() - 1 - i).unwrap()));
            }
        }

        let mut result: i32 = 0;
        for p in 0..forward.len() - 1 {
            for j in forward.get(p).unwrap().0..forward.get(p + 1).unwrap().0 {
                result += height.get(forward.get(p).unwrap().0).unwrap() - height.get(j).unwrap();
            }
        }

        for q in 1..backward.len() {
            for k in backward.get(backward.len() - q).unwrap().0 + 1..backward.get(backward.len() - 1 - q).unwrap().0 {
                result += height.get(backward.get(backward.len() - 1 - q).unwrap().0).unwrap() - height.get(k).unwrap();
            }
        }

        for r in forward.last().unwrap().0 + 1..backward.last().unwrap().0 {
            result += height.get(backward.last().unwrap().0).unwrap() - height.get(r).unwrap();
        }
        return result;
    }
}
