import java.util.ArrayList;
import java.util.LinkedList;

class MyLinkedList {
    private LinkedList<Integer> ll = new ArrayList<>();

    public MyLinkedList() {
    }

    public int get(int index) {
        return index >= 0 && index < ll.size() ? ll.get(index) : -1;
    }

    public void addAtHead(int val) {
        ll.add(0, val);
    }

    public void addAtTail(int val) {
        ll.add(val);
    }

    public void addAtIndex(int index, int val) {
        if (index >= 0 && index <= ll.size()) {
            ll.add(index, val);
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < ll.size()) {
            ll.remove(index);
        }
    }
}
