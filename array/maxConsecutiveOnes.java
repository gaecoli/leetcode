class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret = 0;
        int dp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                dp = 0;
            } else {
                dp++;
            }
            ret = Math.max(dp, ret);
        }
        return ret;
    }
}
