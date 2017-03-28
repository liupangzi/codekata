public class Solution {
    public String complexNumberMultiply(String a, String b) {
        int aP = a.indexOf('+'), bP = b.indexOf('+');
        int a1 = Integer.parseInt(a.substring(0, aP)), a2 = Integer.parseInt(a.substring(aP + 1, a.length() - 1));
        int b1 = Integer.parseInt(b.substring(0, bP)), b2 = Integer.parseInt(b.substring(bP + 1, b.length() - 1));
        return (a1 * b1 - a2 * b2) + "+" + (a1 * b2 + b1 * a2) + "i";
    }
}
