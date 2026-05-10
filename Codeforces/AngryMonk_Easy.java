// https://codeforces.com/contest/1992/problem/B

import java.util.*;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int ones=0;
        int count=0;
        for(int i=0;i<k-1;i++){
            if(arr[i]!=1){
                count+=arr[i]-1;
                ones+=arr[i];
            }else ones++;
        }
        int res=count+ones;
        if(arr[k-1]==1){
           res=ones;
        }
        System.out.println(res);
        }
        
    }
}
