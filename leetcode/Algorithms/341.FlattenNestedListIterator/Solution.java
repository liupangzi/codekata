import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator implements Iterator<Integer> {
    private Stack<NestedInteger> stack = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (stack.size() > 0 && !stack.peek().isInteger()) {
            List<NestedInteger> tmp = stack.pop().getList();
            for (int i = tmp.size() - 1; i >= 0; i--) {
                stack.push(tmp.get(i));
            }
        }
        return stack.size() > 0;
    }
}
