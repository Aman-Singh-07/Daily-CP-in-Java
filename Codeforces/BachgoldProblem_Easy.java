// https://codeforces.com/contest/749/problem/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n%2==0){
            System.out.println(n/2);
            for(int i=0;i<n/2;i++){
                System.out.print(2+" ");
            }
        }else{
            System.out.println((n-3)/2+1);
            for(int i=0;i<(n-3)/2;i++){
                System.out.print(2+" ");
            }
            System.out.print(3+" ");
        }
    }
}
