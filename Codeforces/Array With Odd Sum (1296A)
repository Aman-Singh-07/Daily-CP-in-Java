// https://codeforces.com/problemset/problem/1296/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int countEven=0;
            int countOdd=0;
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                if(x%2==0) countEven++;
                else countOdd++;
            }
            if(countOdd%2==0 && countEven==0) System.out.println("NO");
            else if(countOdd==0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
