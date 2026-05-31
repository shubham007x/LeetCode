class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0;

        for (int x : nums) {
            if (k ==0||k==1 || nums[k - 2] != x) {

                nums[k] = x;
                k++;
            }
        }
        return k;

    }
}