// https://www.geeksforgeeks.org/problems/count-unique-vowel-strings/1


class Solution {
    public int vowelCount(String s) {
        // code here
        int count=0;
        int counta=0;
        int counte=0;
        int counti=0;
        int counto=0;
        int countu=0;
        for(char ch:s.toCharArray()){
            if(ch=='a') counta++;
            if(ch=='e') counte++;
            if(ch=='i') counti++;
            if(ch=='o') counto++;
            if(ch=='u') countu++;
        }
        return (counta!=0 || counte!=0 || counti!=0 || counto!=0 || countu!=0)?fact(0+((counta!=0)?1:0)+((counte!=0)?1:0)+((counti!=0)?1:0)+((counto!=0)?1:0)+((countu!=0)?1:0))*(counta!=0?counta:1)*(counte!=0?counte:1)*(counti!=0?counti:1)*(counto!=0?counto:1)*(countu!=0?countu:1) : 0;
    }
    
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        int res=1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }
}
