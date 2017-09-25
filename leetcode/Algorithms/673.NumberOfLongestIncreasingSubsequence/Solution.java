class Solution {
    public int findNumberOfLIS(int[] nums) {
        int len[] = new int[nums.length], max[] = new int[nums.length], index = 0, result = 0;

        for (int i = 0; i < nums.length; i++) {
            len[i] = max[i] = 1;

            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    int n = len[j] + 1;
                    if (n > len[i]) {
                        len[i] = n;
                        max[i] = max[j];
                    } else if (n == len[i]) {
                        max[i] += max[j];
                    }
                }
            }

            if (len[i] > index) {
                result = max[i];
                index = len[i];
            } else if (len[i] == index) {
                result += max[i];
            }
        }
        return result;
    }
}
