// https://codeforces.com/problemset/problem/1542/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int countOdd=0;
            int countEven=0;
            for(int i=0;i<2*n;i++){
                int x=input.nextInt();
                if(x%2==0) countEven++;
                else countOdd++;
            }
            System.out.println(countOdd==countEven?"Yes":"No");
        }
    }
}
