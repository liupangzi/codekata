import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
    private HashMap<Integer, Integer> map;
    private Random random;
    private int[] table = new int[16];
    private int pointer = 0;

    public RandomizedSet() {
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, pointer);
        table[pointer] = val;
        pointer++;
        if (pointer == table.length) {
            int[] newTable = new int[table.length * 2];
            System.arraycopy(table, 0, newTable, 0, table.length);
            table = newTable;
        }
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int newValue = table[pointer - 1], oldPosition = map.get(val);
        table[oldPosition] = newValue;
        map.put(table[pointer - 1], oldPosition);
        map.remove(val);
        pointer--;
        return true;
    }

    public int getRandom() {
        return pointer == 0 ? 0 : table[random.nextInt(pointer)];
    }
}
