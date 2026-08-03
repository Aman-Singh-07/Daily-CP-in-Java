// https://codeforces.com/contest/2224/problem/A

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int T = input.nextInt();
        int t = 0;
        
        while(t<T){
            int n = input.nextInt();
            long[] array = new long[n];
            
            for(int i = 0;i<n;i++){
                array[i] = input.nextLong();
            }
            long positive = 0;
            
            for(int i = n-1;i>=1;i--){
                if(array[i]>0) positive = array[i];
                else positive = 0;
                
                array[i-1] += positive;
            }
            
            long count = 0;
            
            for(int  i = 0;i<n;i++){
                if(array[i]>0) count++;
            }
            
            System.out.println(count);
            
            t++;
        }
    }
}
