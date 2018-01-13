import java.util.HashMap;

class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) map.put(B[i], i);
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) result[i] = map.get(A[i]);
        return result;
    }
}
