class Solution414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);

        int diff = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                diff++;
            }

            if (diff == 3) {
                return nums[i];
            }
        }
        return nums[0];
    }

    public void reverse(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
