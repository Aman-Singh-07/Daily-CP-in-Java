// https://codeforces.com/problemset/problem/1675/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            long[] arr=new long[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextLong();
            }
            int count=0;
            for(int i=n-1;i>0;i--){
                while(true){
                    if(arr[i]==arr[i-1] && arr[i]==0) break;
                    if(arr[i]<=arr[i-1]){
                        arr[i-1]=(arr[i-1])/2;
                        count++;
                    }else if(arr[i-1]==0){
                        break;
                    }else break;
                }
            }
            boolean isTrue=true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>=arr[i+1]){
                    isTrue=false;
                    break;
                }
            }
            System.out.println(isTrue?count:-1);
            
        }
    }
}
