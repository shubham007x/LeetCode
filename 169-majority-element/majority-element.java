class Solution {
    public int majorityElement(int[] nums) {

        int x = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                x = nums[i];
            }
            if (nums[i] == x) {
                count++;
            } else
                count--;
        }
        return x;

    }
}