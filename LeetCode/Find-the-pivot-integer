//  https://leetcode.com/problems/find-the-pivot-integer/

class Solution {
    public int pivotInteger(int n) {
        int res=-1;
        for(int i=1;i<=n;i++){
            int sum1=0;
            int sum2=0;
            for(int j=1;j<=i;j++){
                sum1+=j;
            }
            for(int k=i;k<=n;k++){
                sum2+=k;
            }
            if(sum1==sum2){
                res=i;
            }
        }
        return res;
        
    }
}
