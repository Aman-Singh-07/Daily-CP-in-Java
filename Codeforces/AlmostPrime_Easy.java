// https://codeforces.com/contest/26/problem/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for(int num=1;num<=n;num++){
            int div=0;
            for(int i=1;i*i<=num;i++){
                if(num%i==0){
                    if(isPrime(i)) div++;
                    if(num/i!=i){
                        if(isPrime(num/i)) div++;
                    }
                }
            }
            if(div==2) count++;
        }
        System.out.println(count);
        
        
    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2 || num==3) return true;
        if(num%2==0 || num%3==0) return false;
        for(int i=5;i*i<=num;i+=6){
            if((num%i==0)|| (num%(i+2)==0)) return false;
        }
        return true;
    }
}
