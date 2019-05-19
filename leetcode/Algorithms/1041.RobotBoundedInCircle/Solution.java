class Solution {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0, d = 0;
        for (int j = 0; j < instructions.length(); j++) {
            if (instructions.charAt(j) == 'L') {
                d = (d + 3) % 4;
            } else if (instructions.charAt(j) == 'R') {
                d = (d + 1) % 4;
            } else {
                if ((d & 1) == 0) {
                    y += d == 0 ? 1 : -1;
                } else {
                    x += d == 1 ? 1 : -1;
                }
            }
        }
        return (x == 0 && y == 0) || d != 0;
    }
}