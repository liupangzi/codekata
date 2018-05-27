import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> left = new HashSet<>(), buffer = new HashSet<>();
        for (int i = 1; i < rooms.size(); i++) left.add(i);
        buffer.add(0);

        while (!buffer.isEmpty()) {
            HashSet<Integer> next = new HashSet<>();
            for (int gate : buffer) {
                for (int index : rooms.get(gate)) {
                    if (left.contains(index)) next.add(index);
                }
            }
            for (int n : next) left.remove(n);
            buffer = next;
        }
        return left.isEmpty();
    }
}
