// https://codeforces.com/problemset/problem/1814/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long n=input.nextLong();
            long k=input.nextLong();
            if(n%2==0 || n%k==0 || (n>=k && (n-k)%2==0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
