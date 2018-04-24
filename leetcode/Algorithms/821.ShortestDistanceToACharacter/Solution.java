class Solution {
    public int[] shortestToChar(String S, char C) {
        int firstE = 0, lastE = S.length() - 1, result[] = new int[S.length()];
        while (S.charAt(firstE) != C) firstE++;
        while (S.charAt(lastE) != C) lastE--;
        for (int i = firstE - 1, j = 1; i >= 0; i--, j++) result[i] = j;
        for (int i = lastE + 1, j = 1; i < S.length(); i++, j++) result[i] = j;

        while (firstE < lastE && firstE >= 0) {
            int nextFirstE = S.indexOf(C, firstE + 1), weight = 0, next = nextFirstE;
            while (firstE <= next) {
                result[firstE++] = weight;
                result[next--] = weight;
                weight++;
            }
            firstE = nextFirstE;
        }
        return result;
    }
}
