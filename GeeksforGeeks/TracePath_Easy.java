// https://www.geeksforgeeks.org/problems/trace-path3840/1

class Solution {
    public boolean isPossible(int n, int m, String s) {
        // code here
        int count1=0;
        int count2=0;
        int rmax=0;
        int rmin=0;
        int cmax=0;
        int cmin=0;
        for(char ch:s.toCharArray()){
            if(ch=='L') count2--;
            else if(ch=='R') count2++;
            else if(ch=='U') count1++;
            else count1--;
            
            rmax=Math.max(rmax,count1);
            rmin=Math.min(rmin,count1);
            cmax=Math.max(cmax,count2);
            cmin=Math.min(cmin,count2);
        }
        if(rmax-rmin+1<=n && cmax-cmin+1<=m)  return true;
        return false;
        
    }
}
