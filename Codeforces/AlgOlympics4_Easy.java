//  https://codeforces.com/gym/574710/problem/D

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            if(n<=1){
                System.out.println(0);
                continue;
            }
            int maxFreq=1;
            int currentFreq=1;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    currentFreq++;
                }else{
                    currentFreq=1;
                }
                maxFreq=Math.max(maxFreq,currentFreq);
            }
            System.out.println(n-maxFreq);
            
            
        }
    }
}
