class Solution {
    public void nextPermutation(int[] nums) {
      int n=nums.length;
      int idx=-1;
      for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            idx=i;
            break;
        }
      }  
      if(idx==-1){
       reverse(nums,0,n-1);
       return;
      }
      for(int i=n-1;i>idx;i--){
        if(nums[i]>nums[idx]){
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
            break;
        }
      }
      reverse(nums,idx+1,n-1);
    }
      private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}