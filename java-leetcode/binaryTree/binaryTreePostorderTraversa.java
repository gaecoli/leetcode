class Solution {
    // 二叉树后续遍历（左->右->根）
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        postorderTreeNode(root, ans);
        return ans;
    }

    // 递归版本
    public void postorderTreeNode(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        postorderTreeNode(root.left, ans);
        postorderTreeNode(root.right, ans);
        ans.add(root.val);
    }
}