public class Solution {
    public String toHex(int num) {
        char[] map = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder result = new StringBuilder(String.valueOf(map[num & 15]));
        while ((num >>>= 4) != 0) result.insert(0, String.valueOf(map[num & 15]));

        return result.toString();
    }
}
