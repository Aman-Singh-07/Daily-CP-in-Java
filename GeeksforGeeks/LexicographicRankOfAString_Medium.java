// https://www.geeksforgeeks.org/problems/rank-the-permutations-1587115621/1

class Solution {
    public int findRank(String s) {
        // code here
        int n=s.length();
        long[] fact=new long[n+1];
        int[] count=new int[256];
        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=(fact[i-1]*i);
            char ch=s.charAt(i-1);
            count[ch]++;
            if(count[ch]>1) return 0;
        }
        long rank=0;
        for(int i=0;i<n;i++){
            char currentChar=s.charAt(i);
            int countSmaller=0;
            for(int j=0;j<currentChar;j++){
                countSmaller+=count[j];
            }
            rank=(rank+(long)countSmaller*fact[n-i-1]);
            count[currentChar]--;
        }
        return (int) (rank+1);
        
    }
}
