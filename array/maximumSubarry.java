class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int ret = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ret = Math.max(dp[i], ret);
        }
        return ret;
    }
}
