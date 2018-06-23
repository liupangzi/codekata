class Solution {
    public int maxDistToClosest(int[] seats) {
        int start = 0, end = seats.length - 1;
        while (seats[start] == 0) start++;
        while (seats[end] == 0) end--;

        int result = Math.max(start, seats.length - 1 - end);
        while (start < end) {
            int cursor = start + 1;
            while (seats[cursor] == 0) cursor++;
            result = Math.max(result, (cursor - start) / 2);
            start = cursor;
        }
        return result;
    }
}
