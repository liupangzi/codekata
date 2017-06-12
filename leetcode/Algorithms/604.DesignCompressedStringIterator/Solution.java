public class StringIterator {
    private char c;
    private int count;
    private int cursor;
    private String s;

    public StringIterator(String compressedString) {
        cursor = 0;
        count = 0;
        c = ' ';
        s = compressedString;
    }

    public char next() {
        if (!hasNext()) return ' ';
        if (count == 0) {
            c = s.charAt(cursor++);
            while (cursor < s.length() && s.charAt(cursor) >= '0' && s.charAt(cursor) <= '9') {
                count = count * 10 + s.charAt(cursor) - 48;
                cursor++;
            }
        }
        count--;
        return c;
    }

    public boolean hasNext() {
        return count != 0 || cursor != s.length();
    }
}
