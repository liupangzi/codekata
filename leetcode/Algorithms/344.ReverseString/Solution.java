public class Solution {
    public String reverseString(String s) {
        char[] array = s.toCharArray();

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        return new String(array);
    }
}
