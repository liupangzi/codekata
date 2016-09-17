public class Solution {
    public int lengthLongestPath(String input) {
        Stack<String> store = new Stack<>();

        int result = 0, length = 0;
        for (String line: input.split(String.valueOf('\n'))){
            int depth = line.lastIndexOf('\t') + 2;
            String str = line.substring(depth - 1);

            while (store.size() >= depth && !store.isEmpty()) {
                length -= store.pop().length() + 1;
            }

            store.push(str);
            length += str.length() + 1;

            if (line.contains(".")) result = Math.max(result, length - 1);
        }

        return result;
    }
}
