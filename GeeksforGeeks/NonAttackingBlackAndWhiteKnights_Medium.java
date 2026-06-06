// https://www.geeksforgeeks.org/problems/black-and-white-1587115620/1
 
class Solution {
    public int numOfWays(int n, int m) {
        long total=(long) n*m;
        long res=total*(total-1);
        long attack=0;
        if(n>=2 && m>=3){
            attack+=4L*(n-1)*(m-2);
        }
        if(n>=3 && m>=2){
            attack+=4L*(n-2)*(m-1);
        }
        return (int) (res-attack);
    }
}
