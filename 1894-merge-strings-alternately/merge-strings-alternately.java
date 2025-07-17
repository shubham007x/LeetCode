class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        String ans="";
        int max=Math.max(m,n);
        for(int i=0;i<max;i++){
            if(i<n){
                ans+=word1.charAt(i);

            }
               if(i<m){
                ans+=word2.charAt(i);

            }
        }
    
        return ans;
    }
}