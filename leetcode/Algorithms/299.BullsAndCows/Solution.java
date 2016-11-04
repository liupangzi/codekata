public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0, cache[] = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            } else {
                if (cache[Character.getNumericValue(secret.charAt(i))]++ < 0) cow++;
                if (cache[Character.getNumericValue(guess.charAt(i))]-- > 0) cow++;
            }
        }
        return String.valueOf(bull) + "A" + String.valueOf(cow) + "B";
    }
}
