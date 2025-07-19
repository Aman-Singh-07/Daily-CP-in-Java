// https://codeforces.com/problemset/problem/80/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<=50;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        int n1=input.nextInt();
        int m1=input.nextInt();
        if(!list.contains(m1)){
            System.out.println("NO");
        }
        else{
            if(list.indexOf(m1)-list.indexOf(n1)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n<=3) return true;
        if(n%2==0 || n%3==0) return false;

        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
