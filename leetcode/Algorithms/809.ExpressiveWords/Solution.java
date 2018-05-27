class Solution {
    public int expressiveWords(String S, String[] words) {
        int result = 0;
        for (String word : words) result += isExpressive(S, word);
        return result;
    }

    private int isExpressive(String S, String word) {
        int cursor = 0, step = 0, start = 0, end = 0;
        while (cursor < S.length() && start < word.length()) {
            if (S.charAt(cursor) != word.charAt(start)) return 0;
            while (step < S.length() && S.charAt(step) == S.charAt(cursor)) step++;
            while (end < word.length() && word.charAt(end) == word.charAt(start)) end++;
            if (step - cursor >= 3 && end - start > step - cursor) return 0;
            if (step - cursor < 3 && end - start != step - cursor) return 0;
            cursor = step;
            start = end;
        }
        return start == word.length() && cursor == S.length() ? 1 : 0;
    }
}
