import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSystem {
    private HashMap<String, List<Integer>> map = new HashMap<>();

    public LogSystem() {
    }

    public void put(int id, String timestamp) {
        map.putIfAbsent(timestamp, new ArrayList<>());
        map.get(timestamp).add(id);
    }

    public List<Integer> retrieve(String s, String e, String gra) {
        ArrayList<Integer> result = new ArrayList<>();
        int cursor = 19;
        switch (gra) {
            case "Year":
                cursor = 4;
                break;
            case "Month":
                cursor = 7;
                break;
            case "Day":
                cursor = 10;
                break;
            case "Hour":
                cursor = 13;
                break;
            case "Minute":
                cursor = 16;
                break;
        }
        s = s.substring(0, cursor);
        e = e.substring(0, cursor);

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            String key = entry.getKey().substring(0, cursor);
            if (key.compareTo(e) <= 0 && key.compareTo(s) >= 0) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }
}
