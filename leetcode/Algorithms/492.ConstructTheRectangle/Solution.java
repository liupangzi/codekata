public class Solution {
    public int[] constructRectangle(int area) {
        int start = (int) Math.sqrt((double) area);
        while (area % start != 0) start--;
        return new int[]{area / start, start};
    }
}
