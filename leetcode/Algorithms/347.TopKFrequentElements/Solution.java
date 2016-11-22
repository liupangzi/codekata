public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        queue.addAll(hashMap.entrySet());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) result.add(queue.poll().getKey());
        return result;
    }
}
