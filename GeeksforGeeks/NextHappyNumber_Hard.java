// https://www.geeksforgeeks.org/problems/next-happy-number4538/1

class Solution {
    public int nextHappy(int n) {
        // code here
        while(true){
            n++;
            if(canDo(n)) return n;
        }
    }
    boolean canDo(int num){
        if(num==1 || num==7) return true;
        if(num==2 || num==3 || num==4 ||  num==5 || num==6 || num==8 || num==9) return false;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=(rem*rem);
            num/=10;
        }
        return canDo(sum);
    }
}
