public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\."), arr2 = version2.split("\\.");
        int count = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < count; i++) {
            int c1 = i < arr1.length ? Integer.valueOf(arr1[i]) : 0;
            int c2 = i < arr2.length ? Integer.valueOf(arr2[i]) : 0;
            if (c1 > c2) return 1;
            if (c1 < c2) return -1;
        }

        return 0;
    }
}
