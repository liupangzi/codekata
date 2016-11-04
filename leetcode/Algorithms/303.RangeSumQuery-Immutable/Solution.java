public class NumArray {
    private int[] cache;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.cache = nums;
    }

    public int sumRange(int i, int j) {
        return i == 0 ? this.cache[j] : this.cache[j] - this.cache[i - 1];
    }
}
