class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int x = (int) (Math.ceil((Math.sqrt((long) target * 8 + 1) - 1.0) / 2)), upper = (x * x + x) / 2;
        return (upper - target) % 2 == 0 ? x : x + 2 - (x + 1) % 2;
    }
}
