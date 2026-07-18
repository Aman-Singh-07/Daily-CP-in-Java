// https://codeforces.com/contest/2247/problem/A

import java.util.*;

public class Main{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int testcase = input.nextInt();
        while(testcase >0){
            int n = input.nextInt();
            int minusCount = 0;
            for(int i=0; i<n; i++){
                int val = input.nextInt();
                if(val == -1){
                    minusCount++;
                }
            }
            if(n % 2 != 0){
                System.out.println("NO");
            } else {
                if(minusCount % 2 == (n / 2) % 2){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            testcase--;
        }
    } 
}
