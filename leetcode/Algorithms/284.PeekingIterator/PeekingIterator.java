import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Integer n = null;
    private Iterator<Integer> i;

    public PeekingIterator(Iterator<Integer> iterator) {
        i = iterator;
        if (i.hasNext()) n = i.next();
    }

    public Integer peek() {
        return n;
    }

    @Override
    public Integer next() {
        int tmp = n;
        n = i.hasNext() ? i.next() : null;
        return tmp;
    }

    @Override
    public boolean hasNext() {
        return n != null;
    }
}
