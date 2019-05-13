import java.util.HashMap;

class Node {
    public Node Pre;
    public Node Next;
    public int Key;
    public int Value;

    public Node(Node pre, Node next, int key, int value) {
        Pre = pre;
        Next = next;
        Key = key;
        Value = value;
    }
}

class LRUCache {
    private HashMap<Integer, Node> map = new HashMap<>();
    private int cap;
    private Node dummyHead = new Node(null, null, 0, 0);
    private Node dummyTail = new Node(null, null, 0, 0);

    public LRUCache(int capacity) {
        cap = capacity + 1;
        dummyHead.Next = dummyTail;
        dummyTail.Pre = dummyHead;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            removeNode(map.get(key));
            addNodeToTail(map.get(key));
            return map.get(key).Value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            removeNode(map.get(key));
            addNodeToTail(map.get(key));
            map.get(key).Value = value;
        } else {
            Node n = new Node(null, null, key, value);
            addNodeToTail(n);

            map.put(key, n);
            if (map.size() == cap) {
                map.remove(dummyHead.Next.Key);
                removeNode(dummyHead.Next);
            }
        }
    }

    private void removeNode(Node n) {
        n.Pre.Next = n.Next;
        n.Next.Pre = n.Pre;
    }

    private void addNodeToTail(Node n) {
        dummyTail.Pre.Next = n;
        n.Pre = dummyTail.Pre;
        dummyTail.Pre = n;
        n.Next = dummyTail;
    }
}