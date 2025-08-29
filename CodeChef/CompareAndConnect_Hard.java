//  https://www.codechef.com/problems/COM_AND_CON?tab=statement


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int m=input.nextInt();
            if(n==0){
                for(int i=0;i<m-2;i++){
                    System.out.print("><");
                }
                System.out.println(">=>");
            }
            else if(m==0){
                for(int i=0;i<n-2;i++){
                    System.out.print("<<");
                }
                System.out.println("<=<");
            }
            else{
                System.out.print("<");
                for(int i=0;i<n-1;i++){
                    System.out.print("<<");
                }
                for(int i=0;i<m;i++){
                    System.out.print("<>");
                }
                System.out.println();
            }
        }
    }
}
