class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, desc = true;
        for (int i = 0; i < nums.length - 1; i++) {
            // 如果既存在单调递增和单调递减的，那么就不是单调数列;
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }

            if (nums[i] < nums[i + 1]) {
                desc = false;
            }
        }
        return inc || desc;
    }
}