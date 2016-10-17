public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            tmp.add(0, 1);
            for (int j = 1; j < tmp.size() - 1; j++) {
                tmp.set(j, tmp.get(j) + tmp.get(j + 1));
            }
            result.add(new ArrayList<>(tmp));
        }
        return result;
    }
}
