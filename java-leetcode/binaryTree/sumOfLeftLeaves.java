class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;

        if (root == null) {
            return 0;
        }

        // 如果左子树不为空 && 但是左子树的左子树和左子树的右子树为空，那证明这个树里面不存在左子树了;
        // 所以当子树不存在则结束递归;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }

        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}