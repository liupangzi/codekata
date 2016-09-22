public class Solution {
    public List<String> readBinaryWatch(int num) {
        int[] watchHour = new int[] {8, 4, 2, 1};
        int[] watchMinute = new int[] {32, 16, 8, 4, 2, 1};
        int[] factor = new int[] {1, 1, 2, 6, 24, 120, 720};
        ArrayList<String> result = new ArrayList<>();

        int end = num < watchHour.length ? num : watchHour.length - 1;
        for (int i = 0; i <= end; i++) {
            int j = num - i;
            if (j >= watchMinute.length) continue;

            ArrayList<String> hourString = new ArrayList<>();
            int hourCount = factor[4] / (factor[i] * factor[4 - i]);
            calculateTime(watchHour, 0, i, new int[hourCount], hourString, false);

            ArrayList<String> minuteString = new ArrayList<>();
            int monuteCount = factor[6] / (factor[j] * factor[6 - j]);
            calculateTime(watchMinute, 0, j, new int[monuteCount], minuteString, true);

            for (String h: hourString) {
                for (String m: minuteString) {
                    result.add(h + ":" + m);
                }
            }
        }

        return result;
    }
    
    public static void calculateTime(
            int[] origin,
            int start,
            int count,
            int[] result,
            ArrayList<String> strings,
            boolean isMinute) {
        if (count != 0) {
            for (int i = start; i <= origin.length - count; i++) {
                result[count - 1] = origin[i];
                calculateTime(origin, i + 1, count - 1, result, strings, isMinute);
            }
        } else {
            int sum = 0;
            for (int number: result) {
                sum += number;
            }

            if ((sum < 60 && isMinute) || (sum < 12 && !isMinute)) {
                if (sum < 10 && isMinute) {
                    strings.add("0" + String.valueOf(sum));
                } else {
                    strings.add(String.valueOf(sum));
                }
            }
        }
    }
}
