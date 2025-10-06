//  https://codeforces.com/problemset/problem/2155/A

import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int sumL=0;
            int count=0;
            while(n>1){
                if(n%2==0){
                    sumL+=n/2;
                    count+=n/2;
                    n=n/2;
                }
                else{
                    sumL+=(n/2);
                    count+=n/2;
                    n=(n/2)+1;
                }
            }
            while(sumL>1){
                if(sumL%2==0){
                    count+=sumL/2;
                    sumL/=2;
                }
                else{
                    count+=sumL/2;
                    sumL=(sumL/2)+1;
                }
            }
            System.out.println(count+1);
        }
    }
}
