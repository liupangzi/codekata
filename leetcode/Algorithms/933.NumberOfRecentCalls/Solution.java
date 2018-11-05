import java.util.LinkedList;

class RecentCounter {
    private LinkedList<Integer> queue = new LinkedList<>();

    public RecentCounter() {

    }

    public int ping(int t) {
        while (queue.size() > 0 && queue.peek() + 3000 < t) {
            queue.poll();
        }
        queue.add(t);
        return queue.size();
    }
}
