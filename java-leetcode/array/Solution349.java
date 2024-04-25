import java.util.Set;
import java.util.HashSet;

public class Solution349 {
    // 求两个数组的交集（哈希表）
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num: nums1) {
            set1.add(num);
        }

        for(int num: nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] ret = new int[set2.size()];
        int index = 0;

        for (int num: set2) {
            ret[index++] = num;
        }
        return ret;
    }
}
