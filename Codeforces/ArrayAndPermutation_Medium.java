// https://codeforces.com/contest/2197/problem/B

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                arr1[i]=input.nextInt();
                map.put(arr1[i],i);
            }
            for(int i=0;i<n;i++){
                arr2[i]=input.nextInt();
            }
            boolean isTrue=true;
            for(int i=1;i<n;i++){
                if(arr2[i]!=arr2[i-1]){
                    if(map.get(arr2[i])<map.get(arr2[i-1])){
                        isTrue=false;
                        break;
                    }
                }
            }
            
            System.out.println(isTrue?"YES":"NO");
        }
    }
}
