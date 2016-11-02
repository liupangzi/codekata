class MyStack {
    private LinkedList<Integer> queue = new LinkedList<>();

    public void push(int x) {
        LinkedList<Integer> tmp = new LinkedList<>();
        tmp.add(x);
        while (!queue.isEmpty()) tmp.add(queue.poll());
        this.queue = tmp;
    }

    public void pop() {
        queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
