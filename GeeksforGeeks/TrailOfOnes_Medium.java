// https://www.geeksforgeeks.org/problems/trail-of-ones3242/1

class Solution {
    public int countConsec(int n) {
        // code here
        int an1=0;
        int an2=1;
        int res=0;
        for(int i=2;i<=n+2;i++){
            res=an1+an2;
            an1=an2;
            an2=res;
        }
        return (int) Math.pow(2,n)-res;
    }
}
