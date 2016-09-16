public class Solution {
    public boolean validUtf8(int[] data) {
        int[] shift = new int[]{3, 4, 5, 7};
        int[] left = new int[]{0b11110, 0b1110, 0b110, 0b0};
        int[] overflow = new int[]{3, 2, 1, 0};

        int i = 0;
        stream:
        while (i < data.length) {
            for (int j = 0; j < 4; j++) {
                if ((data[i] >>> shift[j]) == left[j] && (i + overflow[j]) < data.length) {
                    for (int k = 0; k < overflow[j]; k++) {
                        if (data[i + k + 1] >>> 6 != 0b10) return false;
                    }
                    i += overflow[j] + 1;
                    continue stream;
                }
            }
            return false;
        }

        return true;
    }
}
