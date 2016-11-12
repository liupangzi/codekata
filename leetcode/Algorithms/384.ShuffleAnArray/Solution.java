public class Solution {

    private int[] origin;
    Random random = new Random();

    public Solution(int[] nums) {
        this.origin = nums;
    }

    public int[] reset() {
        return this.origin;
    }

    public int[] shuffle() {
        int len = this.origin.length, result[] = this.origin.clone();
        for (int i = 0; i < len; i++) {
            int a = random.nextInt(len), tmp = result[i];
            result[i] = result[a];
            result[a] = tmp;
        }
        return result;
    }
}
