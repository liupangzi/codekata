class MyQueue {
    Stack<Integer> stack = new Stack<>();

    public void push(int x) {
        Stack<Integer> tmp = new Stack<>();
        while (!stack.empty()) {
            tmp.push(stack.pop());
        }
        stack.push(x);
        while (!tmp.empty()) {
            stack.push(tmp.pop());
        }
    }

    public void pop() {
        stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
