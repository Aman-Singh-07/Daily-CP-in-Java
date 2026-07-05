// https://www.geeksforgeeks.org/problems/maximum-number-of-characters-between-any-two-same-character4552/1

class Solution {
    public int maxCharGap(String s) {
        // code here
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<26;i++){
            arr1[i]=-1;
            arr2[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'a';
            if(arr1[num]==-1) arr1[num]=i;
        }
        for(int i=s.length()-1;i>=0;i--){
            int num=s.charAt(i)-'a';
            if(arr2[num]==-1) arr2[num]=i;
        }
        int max=-1;
        for(int i=0;i<26;i++){
            if(arr1[i]!=-1 && arr2[i]!=-1){
                max=Math.max(arr2[i]-arr1[i]-1,max);
            }
        }
        return max;
    }
}
