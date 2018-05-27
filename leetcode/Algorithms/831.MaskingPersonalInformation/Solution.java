class Solution {
    public String maskPII(String S) {
        if (S.indexOf('@') > 0) {
            return maskEmailAddress(S);
        } else {
            return maskPhoneNumber(S);
        }
    }

    private String maskEmailAddress(String emailAddress) {
        StringBuilder result = new StringBuilder();

        String[] email = emailAddress.split("@");
        String prefix = email[0];

        if (prefix.charAt(0) >= 'a' && prefix.charAt(0) <= 'z') {
            result.append(prefix.charAt(0));
        } else {
            result.append((char) (prefix.charAt(0) + ('a' - 'A')));
        }
        result.append("*****");
        if (prefix.charAt(prefix.length() - 1) >= 'a' && prefix.charAt(prefix.length() - 1) <= 'z') {
            result.append(prefix.charAt(prefix.length() - 1));
        } else {
            result.append((char) (prefix.charAt(prefix.length() - 1) + ('a' - 'A')));
        }

        result.append("@");
        for (int i = 0; i < email[1].length(); i++) {
            if (email[1].charAt(i) == '.') {
                result.append('.');
            } else if (email[1].charAt(i) >= 'a' && email[1].charAt(i) <= 'z') {
                result.append(email[1].charAt(i));
            } else {
                result.append((char) (email[1].charAt(i) + ('a' - 'A')));
            }
        }
        return result.toString();
    }

    private String maskPhoneNumber(String phoneNumber) {
        StringBuilder number = new StringBuilder();
        for (int i = phoneNumber.length() - 1; i >= 0; i--) {
            if (phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9') {
                if (number.length() <= 4) {
                    number.append(phoneNumber.charAt(i));
                } else {
                    number.append('*');
                }

                if (number.length() == 4 || number.length() == 8 || number.length() == 12) {
                    number.append('-');
                }
            }
        }

        if (number.length() > 13) {
            number.append("+");
            return number.reverse().toString();
        } else {
            return number.reverse().substring(1);
        }
    }
}
