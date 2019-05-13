import java.util.HashSet;

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> counter = new HashSet<>();
        for (int a : A) {
            if (counter.contains(a)) return a;
            counter.add(a);
        }
        return 0;
    }
}