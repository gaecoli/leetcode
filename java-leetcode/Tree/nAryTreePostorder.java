class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
        
    }

    void helper(Node root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        for (Node node: root.children) {
            helper(node, ans);
        }
        ans.add(root.val);
    }
}