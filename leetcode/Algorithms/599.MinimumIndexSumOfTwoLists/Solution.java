import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) map.put(list1[i], i);

        int count = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = map.get(list2[j]) + j;
                if (count > sum) {
                    result.clear();
                    count = sum;
                    result.add(list2[j]);
                } else if (count == sum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[0]);
    }
}
