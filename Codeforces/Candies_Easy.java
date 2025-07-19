// https://codeforces.com/problemset/problem/1343/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        input.nextLine();
        while(t-->0){
           int n=input.nextInt();
           int res=0;
           if(n==3) System.out.println(1);
           else{
           for(int i=3;i<n;i++){
               int num=(int)(n/(Math.pow(2,i-1)-1));
               if(num*(Math.pow(2,i-1)-1)==n){
                   System.out.println(num);
                   break;
               }
           }
           }
        }
    }
}
