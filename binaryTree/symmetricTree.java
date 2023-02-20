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

        return p.val == q.val && symmetricTree(p.left, q.right) && symmetricTree(p.right, q.left);
    }
}