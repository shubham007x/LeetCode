class Solution {
    public int maxArea(int[] height) {
 
  int start=0;
  int end=height.length-1;
  int max=0;
  int h=0;
  while(start<end){
 h=Math.min(height[start],height[end]);
  int water=(end-start)*h;
  max=Math.max(water,max);

  if(height[start]<height[end]){
    start++;
  }else end--;

  }
     return max;   
    }
}