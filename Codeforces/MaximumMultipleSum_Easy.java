// https://codeforces.com/problemset/problem/1985/B

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int maxSum=0;
            int bestX=2;
            for(int x=2;x<=n;x++){
                int currentSum=0;
                for(int multiple=x;multiple<=n; multiple+=x){
                    currentSum+=multiple;
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    bestX=x;
                }
            }
            System.out.println(bestX);
        }
    }
}
