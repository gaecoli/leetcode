class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }

        int left = 0, right = num;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * mid < num) {
                left = mid + 1;
            } else if ((long)mid * mid > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}