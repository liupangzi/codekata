public class Solution {
    private static boolean[] isVowel = new boolean[256];
    static{
        isVowel['a'] = true;
        isVowel['o'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['u'] = true;
        isVowel['A'] = true;
        isVowel['O'] = true;
        isVowel['E'] = true;
        isVowel['I'] = true;
        isVowel['U'] = true;
    }

    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        int start = 0, end = s.length() - 1;
        while (true) {
            while (start < s.length() && !isVowel[(int) s.charAt(start)]) start++;
            while (end >= 0 && !isVowel[(int) s.charAt(end)]) end--;
            if (start >= end) return result.toString();
            result.setCharAt(start, s.charAt(end));
            result.setCharAt(end, s.charAt(start));
            start++;
            end--;
        }
    }
}
