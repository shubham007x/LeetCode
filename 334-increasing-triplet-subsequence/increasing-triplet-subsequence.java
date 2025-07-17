class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        pre[0] = nums[0];
        post[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {

            pre[i] = Math.min(pre[i - 1], nums[i]);

        }
        for (int i = nums.length - 2; i > 0; i--) {

            post[i] = Math.max(post[i + 1], nums[i]);

        }
        for (int i = 0; i < nums.length; i++) {
            if (pre[i] < nums[i] && nums[i] < post[i]) {
                return true;
            }
        }
        return false;
    }
}