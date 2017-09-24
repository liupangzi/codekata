import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {
        int result = 0;
        ArrayList<Integer> records = new ArrayList<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    result -= records.get(records.size() - 1);
                    records.remove(records.size() - 1);
                    continue;
                case "D":
                    records.add(records.get(records.size() - 1) * 2);
                    break;
                case "+":
                    records.add(records.get(records.size() - 1) + records.get(records.size() - 2));
                    break;
                default:
                    records.add(Integer.valueOf(op));
                    break;
            }
            result += records.get(records.size() - 1);
        }
        return result;
    }
}
