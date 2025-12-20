// https://codeforces.com/problemset/problem/1834/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            int neg=0,pos=0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] == -1) neg++;
                else pos++;
            }
            int res=0;
            while(pos-neg<0){
                neg--; 
                pos++;
                res++;
            }
            if(neg%2==1){
                res++;
            }
            System.out.println(res);
        }
    }
}
