class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int num = Math.abs(nums[i]); // 有可能为负数，则代表出现过
            int index = num - 1; // num真实索引值
            if (nums[index] > 0) { // 索引值出现过，则标记当前索引值的数字为负数
                nums[index] *= -1;
            }
        }
        for (int i = 0; i < len; i++) {
            // 索引值未出现过，那么当前索引值则为正数
            if (nums[i] > 0) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
