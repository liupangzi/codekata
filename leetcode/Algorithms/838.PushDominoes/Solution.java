class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        char[] tmp = dominoes.toCharArray();
        int last = 0;
        for (int i = 1; i < tmp.length; i++) {
            if (tmp[i] == '.') continue;
            if (tmp[i] == 'L') {
                if (tmp[last] == 'L') {
                    // L...L
                    for (int k = last + 1; k < i; k++) tmp[k] = 'L';
                } else {
                    // R...L
                    int a = last + 1, b = i - 1;
                    while (a < b) {
                        tmp[a++] = 'R';
                        tmp[b--] = 'L';
                    }
                }
            } else {
                if (tmp[last] == 'R') {
                    // R...R
                    for (int k = last + 1; k < i; k++) tmp[k] = 'R';
                }
            }
            last = i;
        }
        return new String(tmp).substring(1, tmp.length - 1);
    }
}
