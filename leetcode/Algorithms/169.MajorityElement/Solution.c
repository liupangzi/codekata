int majorityElement(int* nums, int numsSize) {
    int count = 0, result;
    for (int i = 0; i < numsSize; i++) {
        if (count == 0) result = nums[i];
        count = nums[i] == result ? count + 1 : count - 1;
    }
    return result;
}
