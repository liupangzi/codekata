import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> ipToCIDR(String ip, int range) {
        ArrayList<String> result = new ArrayList<>();
        int origin = str2Int(ip), lastCount = Integer.numberOfTrailingZeros(origin);
        while (range != 0) {
            int segment = (int) Math.pow(2.0, (double) lastCount);
            if (segment <= range) {
                result.add(int2Str(origin) + "/" + String.valueOf(32 - lastCount));
                origin += segment;
                range -= segment;
                lastCount = Integer.numberOfTrailingZeros(origin);
            } else {
                lastCount--;
            }
        }
        return result;
    }

    private String int2Str(int ip) {
        return ((ip >> 24) & 0xFF) + "." + ((ip >> 16) & 0xFF) + "." + ((ip >> 8) & 0xFF) + "." + (ip & 0xFF);
    }

    private int str2Int(String ip) {
        int result = 0;
        String[] inArray = ip.split("\\.");
        for (int i = 3; i >= 0; i--) {
            result |= Integer.parseInt(inArray[3 - i]) << (i * 8);
        }
        return result;
    }
}
