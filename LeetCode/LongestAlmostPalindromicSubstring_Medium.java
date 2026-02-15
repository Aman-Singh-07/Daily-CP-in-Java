// https://leetcode.com/problems/longest-almost-palindromic-substring/

class Solution {
    public int tryPalindrome(String s,int l,int r){
        int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    public int almostPalindromic(String s) {
        int n=s.length();
        int maxLen=0;
        int res=maxLen;
        for(int i=0;i<n;i++){
            maxLen=Math.max(maxLen,expand(s,i,i));
            maxLen=Math.max(maxLen,expand(s,i,i+1));
            res=maxLen;
        }
        return res;
    }
    public int expand(String s,int l,int r){
        int n=s.length();
        while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if(l<0 && r>=n){
            return n;
        }
        int res1=getRes1(s,l,r);
        int res2=getRes2(s,l,r,n);
        return Math.max(res1,res2);
    }

    public int getRes2(String s,int l,int r,int n){
        int res2=0;
        if(r<n){
            res2=tryPalindrome(s,l,r+1);
        }
        return res2;
    }

    public int getRes1(String s,int l,int r){
        int res1=0;
        if(l>=0){
            res1=tryPalindrome(s,l-1,r);
        }
        return res1;
    }
}
