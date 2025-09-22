//  https://codeforces.com/problemset/problem/450/A

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] arr=new int[n];
        
        int last=0;
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
            int rounds=(arr[i]+m-1)/m;
            if (rounds>=max){
                max=rounds;
                last=i+1;
            }
        }
        System.out.println(last);
    }
}
