int integerReplacement(int n) {
    int result = 0;

    while (n != 1) {
        if ((n & 1) == 0) {
            n >>= 1;
            result++;
        } else if ((n == 3) || ((n >> 1) & 1) == 0) {
            n = (n - 1) / 2;
            result += 2;
        } else {
            n = (n - 1) / 2 + 1;
            result += 2;
        }
    }

    return result;
}
