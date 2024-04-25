class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count >= 2) {
                return true;
            }
            map.put(num, count);
        }
        return false;
    }
}
