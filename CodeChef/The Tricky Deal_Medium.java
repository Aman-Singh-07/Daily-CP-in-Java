// https://www.codechef.com/problems/TRICKYDL?tab=statement

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextInt();
            long pow=1;
            long temp=n;
            long sum=1;
            long i=0;
            long d1=-1;
            while(sum<n){
                if(temp-pow>0) d1=i+1;
                n+=temp;
                pow=pow*2;
                sum=sum+pow;
                i++;
            }
            System.out.println(i+" "+d1);
        }
    }
}
