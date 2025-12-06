// https://codeforces.com/problemset/problem/577/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
           if(k%i==0){
               int x=k/i;
               if(x<=n) count++;
           }
        }
        System.out.println(count);
    }
}
