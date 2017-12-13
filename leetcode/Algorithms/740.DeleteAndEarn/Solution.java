import java.util.TreeMap;

class Solution {
    public int deleteAndEarn(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + num);
        }

        int pick = 0, drop = 0, item = 0;
        while (map.size() != 0) {
            int nextItem = map.firstKey(), v = map.remove(nextItem);
            int nextPick = nextItem == item + 1 ? drop + v : Math.max(drop, pick) + v, nextDrop = Math.max(drop, pick);
            item = nextItem;
            drop = nextDrop;
            pick = nextPick;
        }
        return Math.max(pick, drop);
    }
}
