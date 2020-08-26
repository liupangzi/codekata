import java.util.Stack;

class StockSpanner {
    private final Stack<int[]> stack = new Stack<>();

    public StockSpanner() {
        stack.push(new int[]{Integer.MAX_VALUE, 0}); // value, span
    }

    public int next(int price) {
        int span = 1;
        while (stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}

