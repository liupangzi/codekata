class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] number = String.valueOf(N).toCharArray();

        int peek = 0;
        while (peek + 1 < number.length) {
            if (number[peek] > number[peek + 1]) break;
            peek++;
        }
        if (peek == number.length - 1) return N;
        while (peek >= 1 && number[peek] == number[peek - 1]) peek--;

        int result = 0;
        for (int i = 0; i < peek; i++) result = result * 10 + number[i] - 48;
        result = result * 10 + number[peek] - 1 - 48;
        for (int i = peek + 1; i < number.length; i++) result = result * 10 + 9;
        return result;
    }
}
