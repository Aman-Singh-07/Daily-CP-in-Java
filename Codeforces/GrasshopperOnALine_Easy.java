// https://codeforces.com/problemset/problem/1837/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int k=input.nextInt();
            if(x%k==0){
                System.out.println(2);
                System.out.println(1+" "+(x-1));
            }
            else{
                System.out.println(1);
                System.out.println(x);
            }
        }
    }
}
