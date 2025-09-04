// https://codeforces.com/contest/2060/problem/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int a1=input.nextInt();
            int a2=input.nextInt();
            int a4=input.nextInt();
            int a5=input.nextInt();

            int[] res={a1+a2,a4-a2,a5-a4};
            int max=0;
            for(int a3:res){
                int count=0;
                if(a3==a1+a2) count++;
                if(a4==a2+a3) count++;
                if(a5==a3+a4) count++;
                max=Math.max(max,count);
            }

            System.out.println(max);
        }
    }
}
