class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        if (x < 0) {
            return -1;
        }

        int left = 0, right = x;
        int ans = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            // 根号 x 的值满足 k^2 <= x, k的最大值即答案;
            if ((long)mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}