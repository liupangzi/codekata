class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int a : A) sum += a;
        if (sum % 3 != 0) return false;

        int target = sum / 3, tmp = 0, count = 0;
        for (int a : A) {
            tmp += a;
            if (tmp != target) continue;
            count++;
            if (count == 2) return true;
            tmp = 0;
        }
        return false;
    }
}