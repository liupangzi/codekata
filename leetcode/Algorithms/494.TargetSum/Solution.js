/**
 * @param {number[]} nums
 * @param {number} S
 * @return {number}
 */
var findTargetSumWays = function(nums, S) {
    if (nums.length === 0) return 0;

    var cache = {};
    cache[nums[0]] = 1;
    cache[-nums[0]] = (cache[-nums[0]] || 0) + 1;
    for (var i = 1; i < nums.length; i++) {
        var tmp = {};
        for (var k in cache) {
            tmp[parseInt(k) + nums[i]] = (tmp[parseInt(k) + nums[i]] || 0) + cache[k];
            tmp[parseInt(k) - nums[i]] = (tmp[parseInt(k) - nums[i]] || 0) + cache[k];
        }
        cache = tmp;
    }
    return cache[S] || 0;
};
