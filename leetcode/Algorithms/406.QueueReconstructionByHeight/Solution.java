public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                return second[0] == first[0]
                        ? Integer.valueOf(first[1]).compareTo(second[1])
                        : Integer.valueOf(second[0]).compareTo(first[0]);
            }
        });

        List<int[]> container = new ArrayList<>();
        for (int[] element: people) {
            container.add(element[1], element);
        }

        return container.toArray(new int[people.length][]);
    }
}
