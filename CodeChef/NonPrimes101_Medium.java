// https://www.codechef.com/problems/NONPRIME101

import java.util.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int n = input.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> list = new ArrayList<>();
            int ones = 0, evens = 0, odds = 0;
            for(int i = 0; i < n; i++){
                arr[i] = input.nextInt();
                if (arr[i] == 1 && ones < 2) {
                    list.add(i);
                    ones++;
                } else if (arr[i] % 2 == 0 && evens < 2) {
                    list.add(i);
                    evens++;
                } else if (arr[i] % 2 != 0 && arr[i] > 1 && odds < 2) {
                    list.add(i);
                    odds++;
                }
            }
            
            boolean isTrue = false;
            
            for(int i = 0; i < list.size(); i++){
                for(int j = i + 1; j < list.size(); j++){
                    int idx1 = list.get(i);
                    int idx2 = list.get(j);
                    
                    if(!isPrime(arr[idx1] + arr[idx2])){
                        isTrue = true;
                        System.out.println((idx1 + 1) + " " + (idx2 + 1));
                        break;
                    }
                }
                if(isTrue) break;
            }
            
            if(!isTrue) System.out.println("-1");
        }
    }
    
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i * i <= num; i += 6){
            if(num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
