import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
        int b = (p1[0] - p3[0]) * (p1[0] - p3[0]) + (p1[1] - p3[1]) * (p1[1] - p3[1]);
        int c = (p1[0] - p4[0]) * (p1[0] - p4[0]) + (p1[1] - p4[1]) * (p1[1] - p4[1]);
        int d = (p2[0] - p3[0]) * (p2[0] - p3[0]) + (p2[1] - p3[1]) * (p2[1] - p3[1]);
        int e = (p2[0] - p4[0]) * (p2[0] - p4[0]) + (p2[1] - p4[1]) * (p2[1] - p4[1]);
        int f = (p3[0] - p4[0]) * (p3[0] - p4[0]) + (p3[1] - p4[1]) * (p3[1] - p4[1]);
        if (a == 0 || b == 0 || c == 0 || d == 0 || e == 0 || f == 0) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);
        map.put(e, map.getOrDefault(e, 0) + 1);
        map.put(f, map.getOrDefault(f, 0) + 1);
        if (map.size() != 2) return false;

        int list[] = new int[2], index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list[index++] = entry.getKey();
        }
        int s = list[0] < list[1] ? list[0] : list[1], l = list[0] > list[1] ? list[0] : list[1];
        return map.get(s) == 4 && map.get(l) == 2 && s * 2 == l;
    }
}
