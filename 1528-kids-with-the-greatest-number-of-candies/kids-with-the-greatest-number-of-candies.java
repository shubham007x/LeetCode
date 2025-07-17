class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(candies[i],max);

        }
         ArrayList<Boolean> list=new ArrayList<Boolean>();
         for (int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>max || candies[i]+extraCandies == max ){
                list.add(true);
            }
            else list.add(false);
         }
        return list;
    }
}