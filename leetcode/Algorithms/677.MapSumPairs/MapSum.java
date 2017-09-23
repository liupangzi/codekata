import java.util.HashMap;

class MapSum {
    private HashMap<String, Integer> map = new HashMap<>();
    private HashMap<String, Integer> occurred = new HashMap<>();

    public MapSum() {
        map.clear();
        occurred.clear();
    }

    public void insert(String key, int val) {
        if (occurred.containsKey(key)) val -= occurred.get(key);
        occurred.put(key, val);

        for (int i = 1; i <= key.length(); i++) {
            String k = key.substring(0, i);
            map.put(k, map.getOrDefault(k, 0) + val);
        }
    }

    public int sum(String prefix) {
        return map.getOrDefault(prefix, 0);
    }
}
