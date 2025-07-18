class Solution {
    public int pivotIndex(int[] nums) {
        int ans = -1;
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];

        pre[0] = nums[0];
        post[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            post[i] = post[i + 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(pre[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(post[i] + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            int leftSum = (i == 0) ? 0 : pre[i - 1];
            int rightSum = (i == nums.length - 1) ? 0 : post[i + 1];

            if (leftSum == rightSum) {
                return i;
            }
        }
        return ans;
    }
}