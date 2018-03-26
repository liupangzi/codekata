import java.util.HashSet;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[]{
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        HashSet<String> result = new HashSet<>();
        for (String word : words) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                tmp.append(table[word.charAt(i) - 'a']);
            }
            result.add(tmp.toString());
        }
        return result.size();
    }
}
