// https://www.geeksforgeeks.org/problems/exactly-one-swap--170637/1

class Solution {
    int countStrings(String s) {
        // code here
        int n=s.length();
        int[] freq=new int[26];
        boolean hasDuplicate=false;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']>1){
                hasDuplicate=true;
            }
        }
        long total=(long)n*(n-1)/2;
        long dPairs=0;
        for(int i:freq){
            if(i>=2){
                dPairs+=(long)i*(i-1)/2;
            }
        }
        long result=total-dPairs;
        return (int) (result+(hasDuplicate?1:0));
    }
}
