public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int[][] bucket = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            bucket[i] = new int[] {nums[i], i};
        }

        Arrays.sort(bucket, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });

        for (int j = 0; j < bucket.length - 1; j++) {
            if (bucket[j][0] == bucket[j + 1][0] && (bucket[j + 1][1] - bucket[j][1] <= k)) {
                return true;
            }
        }

        return false;
    }
}
