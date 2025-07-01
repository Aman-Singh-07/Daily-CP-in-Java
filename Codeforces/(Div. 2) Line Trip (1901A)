// https://codeforces.com/problemset/problem/1901/A

import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        input.nextLine();
        while(t-->0){
           int n=input.nextInt();
           int x=input.nextInt();
           int[] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=input.nextInt();
           }
           ArrayList<Integer> list=new ArrayList<>();
           list.add(0);
           for(int num:arr){
               list.add(num);
           }
           list.add(x);
           for(int i=n-1;i>=0;i--){
               list.add(arr[i]);
           }
           list.add(0);
           int countMax=0;
            for(int i=0;i<list.size()-1;i++){
                int count=list.get(i+1)-list.get(i);
                if(count>countMax){
                    countMax=count;
                }
            }
            System.out.println(Math.max(2*(x-arr[n-1]),countMax));
        }
    }
}
