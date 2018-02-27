class Solution {
    public String customSortString(String S, String T) {
        int[] table = new int[26];
        for (Character c : T.toCharArray()) {
            table[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        for (Character c : S.toCharArray()) {
            for (int i = 0; i < table[c - 'a']; i++) {
                result.append(c);
            }
            table[c - 'a'] = 0;
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < table[i]; j++) {
                result.append((char) (i + 'a'));
            }
        }

        return result.toString();
    }
}
