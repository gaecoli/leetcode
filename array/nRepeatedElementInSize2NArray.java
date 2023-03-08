class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> result = new HashSet<Integer>();
        for (int num: nums) {
            // 如果有出现 N 次的数据，那么整个 nums 中的不同数据个数为 n+1个，那么重复 n 次
            // 的数据只要再次出现则表示就是该数字；
            if (!result.add(num)) {
                return num;
            }
        }
        return -1;
    }
}