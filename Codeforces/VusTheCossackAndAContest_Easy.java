// https://codeforces.com/problemset/problem/1186/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int k=input.nextInt();
        if(n<=m && n<=k){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
