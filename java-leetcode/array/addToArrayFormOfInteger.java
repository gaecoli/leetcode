class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length - 1;
        int lastSum = k;

        LinkedList<Integer> result = new LinkedList<Integer>();

        while(len >= 0 || lastSum > 0) {
            if (len >= 0) {
                lastSum += num[len];
            }

            result.addFirst(lastSum % 10);
            lastSum /= 10;
            len--;
        }

        return result;
    }
}