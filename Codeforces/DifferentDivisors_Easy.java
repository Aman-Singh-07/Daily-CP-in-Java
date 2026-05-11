// https://codeforces.com/contest/1474/problem/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t =input.nextInt();
        while(t-->0){
            int d=input.nextInt();
            long p=findNextPrime(1+d);
            long q=findNextPrime((int) p+d);
            System.out.println(p*q);
        }
    }
    public static int findNextPrime(int start){
        for(int i=start;;i++){
            if(isPrime(i)) return i;
        }
    }

    public static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
