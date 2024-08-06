class Solution {
    public boolean isPalindrome(int x) {
        // 所有负数和能被 10 整除的数字都不是回文数
        // e.g. 10, 100, 2560 以 0 结尾的数字都可以被 10 整除，结尾为 0 除了 0 以外都不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        // 从后向前取数字，再和原来的数字进行对比
        // 迭代停止条件：x 比翻转后的数字小的时候停止，那么 x > target 的时候就一直迭代
        int target = 0;
        while(x > target) {
            target = target * 10 + x % 10;
            x /= 10;
        }

        // x 长度如果是奇数那么迭代后 target 可能比 x 长一位，长出来的一位属于这个数字的中位数
        // 所以不影响结果，只要 / 10 就好了
        // 如果 x 长度是偶数的话那么迭代完成后位数相同，所以直接进行比较 x 和 target
        return x == target || x == target / 10;
    }
}