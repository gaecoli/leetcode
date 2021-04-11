class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        // 双指针
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length || nums[i] + 1 != nums[i + 1]) {
                StringBuilder sb = new StringBuilder();
                sb.append(nums[flag]);

                // 如果flag == i, 说明本身为一个区间
                if (flag != i) {
                    sb.append("->").append(nums[i]);
                }

                ret.add(sb.toString());
                flag = i + 1;
            }
        }
        return ret;
    }
}
