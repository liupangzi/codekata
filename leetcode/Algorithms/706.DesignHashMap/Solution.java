class Node {
    int key;
    int val;
    Node next;

    public Node(int k, int v) {
        key = k;
        val = v;
    }
}

class MyHashMap {
    private int SIZE = 100013;
    private Node[] hm = new Node[SIZE];

    public MyHashMap() {
    }

    public void put(int key, int value) {
        if (hm[key % SIZE] == null) {
            hm[key % SIZE] = new Node(key, value);
        } else {
            Node tmp = hm[key % SIZE];
            while (tmp != null) {
                if (tmp.key == key) {
                    tmp.val = value;
                    return;
                } else {
                    tmp = tmp.next;
                }
            }
        }
    }

    public int get(int key) {
        Node tmp = hm[key % SIZE];
        while (tmp != null) {
            if (tmp.key == key) {
                return tmp.val;
            } else {
                tmp = tmp.next;
            }
        }
        return -1;
    }

    public void remove(int key) {
        put(key, -1);
    }
}
