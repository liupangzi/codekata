import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int a = 0, b = 1, aSum = 0, bSum = 0;
        for (int num : nums) {
            if (a == num) {
                aSum++;
            } else if (b == num) {
                bSum++;
            } else {
                if (aSum == 0) {
                    a = num;
                    aSum = 1;
                } else if (bSum == 0) {
                    b = num;
                    bSum = 1;
                } else {
                    aSum--;
                    bSum--;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int aCount = 0, bCount = 0;
        for (int num : nums) {
            if (num == a) aCount++;
            if (num == b) bCount++;
        }
        if (aCount * 3 > nums.length) result.add(a);
        if (bCount * 3 > nums.length) result.add(b);
        return result;
    }
}
