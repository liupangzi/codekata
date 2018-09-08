class Node {
    int key;
    Node next;

    public Node(int k) {
        key = k;
    }
}

class MyHashSet {
    private int SIZE = 100013;
    private Node[] hm = new Node[SIZE];

    public MyHashSet() {
    }

    public void add(int key) {
        if (hm[key % SIZE] != null) {
            Node tmp = hm[key % SIZE];
            while (tmp != null) {
                if (tmp.key == key) {
                    return;
                } else {
                    tmp = tmp.next;
                }
            }
        }
        Node n = new Node(key);
        n.next = hm[key % SIZE];
        hm[key % SIZE] = n;
    }

    public void remove(int key) {
        Node dummyNode = new Node(0), tmp = dummyNode;
        dummyNode.next = hm[key % SIZE];
        while (tmp.next != null) {
            if (tmp.next.key == key) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        hm[key % SIZE] = dummyNode.next;
    }

    public boolean contains(int key) {
        Node tmp = hm[key % SIZE];
        while (tmp != null) {
            if (tmp.key == key) {
                return true;
            } else {
                tmp = tmp.next;
            }
        }
        return false;
    }
}
