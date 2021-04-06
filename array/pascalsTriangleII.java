class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> cur = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> pre = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pre.add(1);
                } else {
                    pre.add(cur.get(j - 1) + cur.get(j));
                }
            }
            cur = pre;
        }
        return cur;
    }
}
