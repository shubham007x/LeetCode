class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        List<Integer> list =new ArrayList<>();
         list.add(1);
        for(int col=1;col<=rowIndex;col++){
            ans=ans*(rowIndex-col+1);
            ans=ans/col;
            list.add((int)ans);
        }
        return list;
    }
}