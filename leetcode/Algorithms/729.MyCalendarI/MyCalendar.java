import java.util.ArrayList;
import java.util.Collections;

class MyCalendar {
    private ArrayList<Integer> head = new ArrayList<>();
    private ArrayList<Integer> tail = new ArrayList<>();

    public MyCalendar() {
    }

    public boolean book(int start, int end) {
        end--;
        int s = Collections.binarySearch(head, start), e = Collections.binarySearch(tail, end);
        if (s >= 0 || e >= 0 || s != e) return false;
        int index = -s - 1;
        if (index != 0 && tail.get(index - 1) >= start) return false;
        if (index != tail.size() && end >= head.get(index)) return false;
        head.add(index, start);
        tail.add(index, end);
        return true;
    }
}
