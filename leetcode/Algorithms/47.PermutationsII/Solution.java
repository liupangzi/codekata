import java.util.*;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Collections.singletonList(nums[0]));
        for (int i = 1; i < nums.length; i++) {
            int queueSize = queue.size();
            while (queueSize-- > 0) {
                List<Integer> record = queue.poll();
                for (int j = 0; j <= record.size(); j++) {
                    boolean shouldBreak = j == record.size() || nums[i] == record.get(j);
                    List<Integer> tmp = new ArrayList<>(record);
                    tmp.add(j, nums[i]);
                    queue.add(tmp);
                    if (shouldBreak) break;
                }
            }
        }
        return new ArrayList<>(queue);
    }
}
