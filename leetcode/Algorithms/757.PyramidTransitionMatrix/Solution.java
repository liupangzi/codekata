import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        HashMap<String, HashSet<Character>> cache = new HashMap<>();
        for (String a : allowed) {
            String k = a.substring(0, 2);
            cache.putIfAbsent(k, new HashSet<>());
            cache.get(k).add(a.charAt(2));
        }

        ArrayList<HashSet<Character>> list = new ArrayList<>();
        for (int i = 0; i < bottom.length(); i++) {
            HashSet<Character> tmp = new HashSet<>();
            tmp.add(bottom.charAt(i));
            list.add(tmp);
        }

        while (list.size() > 1) {
            ArrayList<HashSet<Character>> next = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                HashSet<Character> tmp = new HashSet<>();
                for (Character m : list.get(i)) {
                    for (Character n : list.get(i + 1)) {
                        String k = String.valueOf(m) + String.valueOf(n);
                        if (cache.containsKey(k)) tmp.addAll(cache.get(k));
                    }
                }
                if (tmp.size() == 0) return false;
                next.add(tmp);
            }
            list = next;
        }
        return true;
    }
}
