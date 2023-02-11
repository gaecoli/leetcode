class Solution {
    /*
    * 二叉树遍历：
    * 1.前序遍历：根节点->左节点->右节点;（本道题为前序遍历）
    * 2.中序遍历：左节点->根节点->右节点;
    * 3.后序遍历：左节点->右节点->根节点;
    * */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();

        preorderTreeNode(root, ans);
        return ans;

    }

    // 方法一：递归解题方法
    public void preorderTreeNode(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.val);
        preorderTreeNode(root.left, ans);
        preorderTreeNode(root.right, ans);
    }

    
}