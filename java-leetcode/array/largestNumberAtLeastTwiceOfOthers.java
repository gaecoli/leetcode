class Solution {
    // 方法 1
    public int dominantIndex(int[] nums) {
        int max = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] * 2 > max && nums[i] != max) {
                return -1;
            }
        }
        return index;
    }

    // 方法 2（一次遍历）
    // 本题目简化为，最大值是次大值的 2 倍；
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;

        int max1 = -1, max2 = -1, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return max2 * 2 <= max1 ? index : -1;
    }
}