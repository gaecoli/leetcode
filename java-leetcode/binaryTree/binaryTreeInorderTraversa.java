class Solution {
    // 二叉树中序遍历（左->根->右）
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer> ();

        inorderTreeNode(root, ans);
        return ans;
    }

    // 递归版本
    public void inorderTreeNode(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        inorderTreeNode(root.left, ans);
        ans.add(root.val);
        inorderTreeNode(root.right, ans);
    }
}