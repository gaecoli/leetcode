//给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
//
//        请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
//
//
//
//        示例 1：
//
//        输入：nums = [100,4,200,1,3,2]
//        输出：4
//        解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
//        示例 2：
//
//        输入：nums = [0,3,7,2,5,8,4,6,0,1]
//        输出：9
//        示例 3：
//
//        输入：nums = [1,0,1,2]
//        输出：3
class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();

        for (int n: nums) {
            set.add(n);
        }

        for (int n: set) {
            if (set.contains(n-1)) {
                continue;
            }

            // 证明现在是以最小的值为基准了,continue 完毕则表示现在就是最小的为基准了
            int m = n + 1;
            while (set.contains(m)) {
                m++;
            }

            // 当 m 跳出循环 m - 1 就是 hash 表中最后一个数，所以 n -> m - 1 的个数为 m - 1 -n + 1 => m - n;
            ans = Math.max(ans, m - n);
        }
        return ans;
    }
}