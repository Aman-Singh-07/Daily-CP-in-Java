// https://codeforces.com/problemset/problem/2037/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j] && arr[i]!=-1){
                        count++;
                        arr[i]=-1;
                        arr[j]=-1;
                    }
                }
            }
            System.out.println(count);
        }
        
    }
}
