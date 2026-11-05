// https://www.geeksforgeeks.org/problems/minimum-days--170646/1

class Solution {
    public int getMinimumDays(String s, int[] p) {
        // code here
        char[] ch=s.toCharArray();
        int idx=-1;
        for(int i=0;i<s.length();i++){
            boolean isHave=false;
            if(p[i]!=0){
                if(ch[p[i]]==ch[p[i]-1]){
                    ch[p[i]]='?';
                    isHave=true;
                }
            }
            if(p[i]!=s.length()-1){
                if(ch[p[i]]==ch[p[i]+1]){
                    ch[p[i]]='?';
                    isHave=true;
                }
            }
            if(isHave) idx=i;
        }
        
        return idx+1;
        
    }
}
