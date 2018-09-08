import java.util.HashSet;

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        HashSet<Integer> tmp = new HashSet<>();
        int delta = 0;
        for (int a : A) delta += a;
        for (int b : B) {
            delta -= b;
            tmp.add(b);
        }
        delta /= 2;

        for (int a : A) {
            if (tmp.contains(a - delta)) {
                return new int[]{a, a - delta};
            }
        }
        return new int[]{0, 0};
    }
}
