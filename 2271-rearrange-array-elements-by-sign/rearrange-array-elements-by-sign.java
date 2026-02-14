class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int positive = 0;
        int negative = 1;

        for (int num : nums) {
            if (num > 0) {
                ans[positive] = num;
                positive += 2;
            }else{
                ans[negative]=num;
                negative+=2;
            }
        }
        return ans;
    }
}