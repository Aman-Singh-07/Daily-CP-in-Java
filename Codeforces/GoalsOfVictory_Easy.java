// https://codeforces.com/contest/1877/problem/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();  
        while(t-->0){
            int n=input.nextInt();
            int sum=0;
            for(int i=0;i<n-1;i++){
                sum+=input.nextInt();
            }
            System.out.println(-sum);
        }
    }
}
