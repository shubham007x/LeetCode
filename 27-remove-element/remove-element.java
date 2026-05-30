class Solution {
    public int removeElement(int[] nums, int val) {

        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {

            int x = nums[i];
            if (x == val) {
                nums[i] = 101;
                count--;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}