// https://codeforces.com/contest/1343/problem/B

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            if(n%4!=0) System.out.println("NO");
            else{
                System.out.println("YES");
                int j=2;
                long sum1=0;
                for(int i=0;i<n/2;i++){
                    System.out.print(j+" ");
                    sum1+=j;
                    j+=2;
                }
                j=1;
                long sum2=0;
                for(int i=0;i<(n/2)-1;i++){
                    System.out.print(j+" ");
                    sum2+=j;
                    j+=2;
                }
                System.out.print((sum1-sum2));
                System.out.println();
            }
            
        }
    }
}
