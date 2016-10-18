public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> bucket = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int aNums1 : nums1) bucket.put(aNums1, 0);
        for (int aNums2 : nums2) if (bucket.containsKey(aNums2)) set.add(aNums2);

        int[] result = new int[set.size()];
        int k = 0;
        for (Integer integer: set) result[k++] = integer;
        return result;
    }
}
