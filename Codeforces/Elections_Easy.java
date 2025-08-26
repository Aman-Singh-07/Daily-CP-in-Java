// https://codeforces.com/problemset/problem/1593/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long[] arr=new long[3];
            int count=0;
            long max=0;
            for(int i=0;i<3;i++){
                arr[i]=input.nextLong();
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            long a=arr[0];
            long b=arr[1];
            long c=arr[2];
            for(long num:arr){
                if(num==max){
                    count++;
                }
            }
            if(a==b && b==c){
                System.out.println("1 1 1");
            }
            else if(count==2){
                System.out.println((max-a+1)+" "+(max-b+1)+" "+(max-c+1));
            }
            else{
                a=max-a;
                b=max-b;
                c=max-c;
                if(a==0){
                    System.out.println(a+" "+(b+1)+" "+(c+1));
                }
                else if(b==0){
                    System.out.println((a+1)+" "+b+" "+(c+1));
                }
                else if(c==0){
                    System.out.println((a+1)+" "+(b+1)+" "+c);
                }
            }
        }
    }
}
