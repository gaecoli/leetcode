class Solution {
    public int majorityElement(int[] nums) {
        // 哈希表
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int counts = nums.length / 2;
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > counts) return num;
            map.put(num, count);
        }
        return -1;
    }
}
