class Solution {
    public boolean isPossible(int[] nums) {
        int start = 0, end = 0;
        while (end < nums.length && nums[end] == nums[start]) end++;
        int last = nums[end - 1];

        while (end < nums.length) {
            if (last + 1 != nums[end]) {
                if (last - nums[end - 1] < 2) return false;
                last = nums[end] - 1;
            }

            int next = end;
            while (next < nums.length && nums[next] == nums[end]) next++;
            if (next - end < end - start) {
                if (last - nums[end * 2 - next - 1] < 2) return false;
                last = nums[end];
                System.arraycopy(nums, end * 2 - next, nums, end, next - end);
            } else {
                last = nums[end];
                System.arraycopy(nums, start, nums, end + start - start, end - start);
            }
            start = end;
            end = next;
        }
        return start == end || last - nums[nums.length - 1] >= 2;
    }
}
