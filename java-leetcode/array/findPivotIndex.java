class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            // rightSum 里面也算 nums[i]的，
            // 所以当 leftSum 里面有 nums[i]的时候，多减去了一次 nums[i]，应该加上；
            rightSum = sum - leftSum + nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}