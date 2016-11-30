public class Solution {
    public int maxProduct(String[] words) {
        int wordsLength = words.length, bits[] = new int[words.length];
        for (int i = 0; i < wordsLength; i++) {
            for (char c : words[i].toCharArray()) {
                bits[i] |= 1 << (c - 'a');
            }
        }

        int result = 0;
        for (int j = 0; j < wordsLength; j++) {
            for (int k = j + 1; k < wordsLength; k++) {
                if ((bits[j] & bits[k]) == 0) {
                    result = Math.max(result, words[j].length() * words[k].length());
                }
            }
        }
        return result;
    }
}
