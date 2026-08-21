// https://www.geeksforgeeks.org/problems/transform-string5648/1

class Solution {
    int transform(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return -1;
        int[] freq=new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int fq:freq){
            if(fq!=0) return -1;
        }
        
        int i=s1.length()-1;
        int j=s2.length()-1;
        int res=0;
        while(i>=0){
            while(i>=0 && s1.charAt(i)!=s2.charAt(j)){
                res++;
                i--;
            }
            if(i>=0){
                i--;
                j--;
            }
        }
        return res;
    }
}
