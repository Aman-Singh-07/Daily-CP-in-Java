// https://codeforces.com/problemset/problem/1931/B

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            int total=0;
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt(); 
                total+=arr[i];
            }
            int avg=total/n;
            int prefixSum=0;
            boolean isTrue=true;
            for(int i=0;i<n;i++){
                prefixSum+=arr[i];
                if(prefixSum<avg*(i+1)){
                    isTrue=false;
                    break;
                }
            }
            
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
