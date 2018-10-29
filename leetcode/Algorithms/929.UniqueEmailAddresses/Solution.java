import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder k = new StringBuilder();
            for (char c : email.toCharArray()) {
                if (c == '+' || c == '@') break;
                if (c == '.') continue;
                k.append(c);
            }
            k.append("@").append(email.substring(email.indexOf("@") + 1));
            set.add(k.toString());
        }
        return set.size();
    }
}
