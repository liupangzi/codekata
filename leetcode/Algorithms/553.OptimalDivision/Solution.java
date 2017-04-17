public class Solution {
    public String optimalDivision(int[] nums) {
        if (nums.length == 1) return nums[0] + "";
        if (nums.length == 2) return nums[0] + "/" + nums[1];

        StringBuilder result = new StringBuilder();
        result.append(nums[0]).append("/(").append(nums[1]);
        for (int i = 2; i < nums.length - 1; i++) result.append("/").append(nums[i]);
        result.append("/").append(nums[nums.length - 1]).append(")");
        return result.toString();
    }
}
