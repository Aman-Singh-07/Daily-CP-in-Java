// https://www.codechef.com/problems/P4BAR?tab=statement

import java.util.*;

class BinaryFlip {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            String s=input.next();
            int c0=0,c1=0;
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='0') c0++;
                if (s.charAt(i)=='1' && s.charAt(i+1)=='1') c1++;
            }
            int diff=c0-c1;
            if(diff<=0) System.out.println(0);
            else System.out.println((diff+1)/2);
        }
    }
}
