class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       for(int i=m;i<m+n;i++){
        int x=nums2[i-m];
        nums1[i]=x;
       } 
    Arrays.sort(nums1);
    }
}
