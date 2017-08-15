public class Solution {
    public boolean judgeCircle(String moves) {
        int U = 0, L = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                U++;
            } else if (c == 'D') {
                U--;
            } else if (c == 'L') {
                L++;
            } else {
                L--;
            }
        }
        return U == 0 && L == 0;
    }
}
