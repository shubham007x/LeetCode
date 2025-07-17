class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];
        int[] res = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {

            product = product * nums[i];
            pre[i] = product;
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {

            product = product * nums[i];
            suff[i] = product;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = suff[i + 1] * 1;
            }else if(i==nums.length-1){
                res[i]=pre[i-1]*1;
            }
            else {
                res[i]=pre[i-1]*suff[i+1];
            }
        }
        return res;
    }
}