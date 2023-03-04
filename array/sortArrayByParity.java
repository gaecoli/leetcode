class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            while(left < right && isEven(nums[left])) {
                left++;
            }
            while(left < right && !isEven(nums[right])) {
                right--;
            }

            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }
        return nums;
    }

    boolean isEven(int num) {
        return num % 2 == 0;
    }
}