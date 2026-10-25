// https://www.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1

class Solution {
    public int beautySum(String s) {
        // code here
        int count=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int min=s.length();
                int max=0;
                for(int k=0;k<26;k++){
                    if(freq[k]!=0){
                        min=Math.min(min,freq[k]);
                        max=Math.max(max,freq[k]);
                    }
                }
                count+=max-min;
            }
        }
        return count;
    }
}
