// https://codeforces.com/contest/1358/problem/A

import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            if(n==1 && m==1){
                System.out.println(1);
                continue;
            }
            if(n%2==0 && m%2==0){
                System.out.println((n*m)/2);
                continue;
            }
            if(n%2==1 && m%2==1){
                System.out.println((((n*m)+1)/2));
                continue;
            }
            if(n%2==0 && m%2==1){
                System.out.println((n*m)/2);
                continue;
            }
            else{
                System.out.println((n*m)/2);
            }
        }
    }
}
