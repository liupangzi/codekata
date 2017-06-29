import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long l = (long) nums[i], floor = set.floor(l + t);
            if (floor != null && floor >= l - t) return true;
            set.add(l);
            if (i >= k) set.remove((long) nums[i - k]);
        }
        return false;
    }
}
