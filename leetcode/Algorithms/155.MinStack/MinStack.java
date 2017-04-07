public class MinStack {
    private Stack<Integer> stack;
    private ArrayList<Integer> cache;
    private int cur;

    public MinStack() {
        stack = new Stack<>();
        cache = new ArrayList<>();
        cur = -1;
    }

    public void push(int x) {
        if (stack.size() == cache.size()) cache.add(0);
        stack.push(x);

        if (cur == -1) {
            cache.set(cur + 1, x);
        } else {
            cache.set(cur + 1, Math.min(x, cache.get(cur)));
        }
        cur++;
    }

    public void pop() {
        stack.pop();
        cur--;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return cache.get(cur);
    }
}
