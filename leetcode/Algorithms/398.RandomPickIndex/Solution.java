public class Solution {
    private HashMap<Integer, ArrayList<Integer>> store;
    private Random random;

    public Solution(int[] nums) {
        this.store  = new HashMap<>();
        this.random = new Random();
        for (int i = 0; i < nums.length; i++) {
            store.putIfAbsent(nums[i], new ArrayList<>());
            store.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {
        int idx = this.random.nextInt(this.store.get(target).size());
        return this.store.get(target).get(idx);
    }
}
