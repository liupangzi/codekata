public class Solution {
    public String validIPAddress(String IP) {
        if (isIPv4(IP)) {
            return "IPv4";
        } else if (isIPv6(IP)) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }

    private boolean isIPv4(String s) {
        if (s.length() < 7 || s.length() > 15 || s.charAt(0) == '.' || s.charAt(s.length() - 1) == '.') return false;
        String[] tmp = s.split("\\.");
        if (tmp.length != 4) return false;
        for (int i = 0; i < 4; i++) {
            int len = tmp[i].length();
            if (len > 3 || len == 0 || (len > 1 && tmp[i].charAt(0) == '0')) return false;
            for (int j = 0; j < len; j++) {
                if (tmp[i].charAt(j) > 57 || tmp[i].charAt(j) < 48) return false;
            }
            if (Integer.parseInt(tmp[i]) > 255) return false;
        }
        return true;
    }

    private boolean isIPv6(String s) {
        if (s.length() < 15 || s.length() > 39 || s.charAt(0) == ':' || s.charAt(s.length() - 1) == ':') return false;
        String[] tmp = s.split(":");
        if (tmp.length != 8) return false;
        for (int i = 0; i < 8; i++) {
            int len = tmp[i].length();
            if (len > 4 || len == 0) return false;
            for (int j = 0; j < len; j++) {
                if (!((tmp[i].charAt(j) >= 48 && tmp[i].charAt(j) <= 57)
                        || (tmp[i].charAt(j) >= 65 && tmp[i].charAt(j) <= 70)
                        || (tmp[i].charAt(j) >= 97 && tmp[i].charAt(j) <= 102))) {
                    return false;
                }
            }
        }
        return true;
    }
}
