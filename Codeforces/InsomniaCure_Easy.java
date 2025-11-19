// https://codeforces.com/problemset/problem/148/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k=input.nextInt();
        int l=input.nextInt();
        int m=input.nextInt();
        int n=input.nextInt();
        int d=input.nextInt();
        boolean[] bool=new boolean[d];
        for(int i=0;i<d;i++){
            bool[i]=false;
        }
        for(int i=0;i<d;i++){
            if((i+1)%k==0 || (i+1)%l==0 || (i+1)%m==0 || (i+1)%n==0){
                bool[i]=true;
            }
        }
        int count=0;
        for(int i=0;i<d;i++){
            if(bool[i]==true) count++;
        }
        System.out.println(count);
    }
}
