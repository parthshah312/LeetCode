class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String ans="";
        while(i<word1.length() && i <word2.length()){
            ans+=String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(i));
            i++;
        }
        if(i>=word1.length()){
            while(i<word2.length()){
                ans+=String.valueOf(word2.charAt(i));
                i++;
            }
        }
        else if(i>=word2.length()){
            while(i<word1.length()){
                ans+=String.valueOf(word1.charAt(i));
                i++;
            }
        }
        return ans;
    }
}