class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }

        return symmetricTree(root.left, root.right);
    }

    boolean symmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        // p的左子树和q的右子树相等 && p的右子树和q的左子树相等
        return p.val == q.val && symmetricTree(p.left, q.right) && symmetricTree(p.right, q.left);
    }
}