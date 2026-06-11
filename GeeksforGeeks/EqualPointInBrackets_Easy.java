// https://www.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1

class Solution {
    public int findIndex(String s) {
        // code here
        int[] prefix=new int[s.length()];
        if(s.charAt(0)=='(') prefix[0]=1;
        else prefix[0]=0;
        for(int i=1;i<s.length();i++){
            int x=(s.charAt(i)=='(')?1:0;
            prefix[i]=prefix[i-1]+x;
        }
        int[] suffix=new int[s.length()];
        if(s.charAt(s.length()-1)==')') suffix[s.length()-1]=1;
        else suffix[s.length()-1]=0;
        for(int i=s.length()-2;i>=0;i--){
            int x=s.charAt(i)==')'?1:0;
            suffix[i]=suffix[i+1]+x;
        }
        for(int i=1;i<s.length();i++){
            if(prefix[i-1]==suffix[i]){
                return i;
            }
        }
        return suffix[0]==0?0:s.length();
    }
}
