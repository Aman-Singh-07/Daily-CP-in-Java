// https://www.geeksforgeeks.org/problems/nth-number-made-of-prime-digits4319/1

class Solution {
    public static int primeDigits(int n) {
        // code here
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int r=n%4;
            if(r==1) sb.append('2');
            else if(r==2) sb.append('3');
            else if(r==3) sb.append('5');
            else{
                sb.append('7');
                n--;
            }
            n/=4;
        }
        return Integer.parseInt(sb.reverse().toString());
        
    }
}
