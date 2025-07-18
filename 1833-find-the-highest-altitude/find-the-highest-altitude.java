class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length + 1;

        int sum = 0;
        int max = 0;
        for (int i = 1; i < n; i++) {
            sum += gain[i - 1];

            max = Math.max(sum, max);
        }

        return max;
    }
}