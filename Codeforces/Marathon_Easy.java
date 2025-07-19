// https://codeforces.com/problemset/problem/1692/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int[] arr=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=input.nextInt();
            }
            int count=0;
            for(int i=1;i<4;i++){
                if(arr[i]>arr[0]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
