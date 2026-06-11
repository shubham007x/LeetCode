class Solution {
    public boolean canJump(int[] nums) {
        int steps=nums[0];
        if(steps==0 && nums.length!=1)return false;
        for(int i=1;i<nums.length;i++){
            steps--;
            if(steps<=nums[i]){
                steps=nums[i];
            }
            if(steps==0 && i<nums.length-1){
                return false;
            }
        }
        return true;

    }
}