import java.util.TreeMap;

class MyCalendarTwo {
    private TreeMap<Integer, Integer> one = new TreeMap<>();
    private TreeMap<Integer, Integer> two = new TreeMap<>();

    public MyCalendarTwo() {
    }

    public boolean book(int start, int end) {
        if (two.containsKey(start)) return false;
        end--;
        Integer a = two.lowerKey(start), b = two.higherKey(start);
        if ((a != null && two.get(a) >= start) || b != null && end >= b) return false;

        Integer cursor = one.lowerKey(start);
        if (cursor == null || one.get(cursor) < start) cursor = one.higherKey(start - 1);
        while (cursor != null && cursor <= end) {
            if (cursor < start) {
                one.put(start, one.get(cursor));
                one.put(cursor, start - 1);
                cursor = start;
            } else if (cursor > start) {
                one.put(start, cursor - 1);
                start = cursor;
            } else {
                Integer v = one.remove(cursor);
                if (end <= v) {
                    two.put(start, end);
                    cursor = end + 1;
                    if (cursor <= v) one.put(cursor, v);
                } else {
                    two.put(cursor, v);
                    start = v + 1;
                    cursor = one.higherKey(cursor);
                }
            }
        }
        if (start <= end) one.put(start, end);
        return true;
    }
}
