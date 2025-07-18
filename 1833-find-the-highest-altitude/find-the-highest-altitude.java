class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length + 1;
        int[] pre = new int[n];
        pre[0] = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += gain[i - 1];
            pre[i] = sum;
        }
        Arrays.sort(pre);
        for (int i = 0; i < n; i++) {
            System.out.print(pre[i] + " ");
        }

        return pre[n-1];
    }
}