// https://codeforces.com/problemset/problem/427/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int sum=0;
        int count=0;
        for(int i=0;i<t;i++){
            int x=input.nextInt();
            if(x<0 && sum==0){
                count++;
            }
            else sum+=x;
        }
        System.out.println(count);
   }
}
