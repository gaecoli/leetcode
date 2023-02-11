import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    // 异或解法
    public int singleNumber(int[] nums) {
        // if (nums.length == 1) {
        //     return nums[0];
        // }
        int ans = 0;

        // 仅限定其他数字出现的次数为 2 次;
        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }

    // 哈希表方法
    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // 将所有数据放入哈希表 <值, 次数>
        for (int num: nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        for (int num: map.keySet()) {
            if(map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

}
