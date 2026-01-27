// https://codeforces.com/problemset/problem/1660/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long a=input.nextLong();
            long b=input.nextLong();
            if(a==0) System.out.println(1);
            else{
                System.out.println(a+2*b+1);
            }
        }
    }
}
