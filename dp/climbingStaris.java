class Solution {
    public int climbStairs(int n) {
        // f(x) = f(x- 1) + f(x - 2)
        // p = f(x - 1)
        // q = f(x - 2)
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
