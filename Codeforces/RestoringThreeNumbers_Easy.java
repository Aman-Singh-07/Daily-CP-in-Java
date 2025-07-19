// https://codeforces.com/problemset/problem/1154/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        int a=arr[3]-arr[0];
        int b=arr[2]-a;
        int c=arr[1]-a;
        System.out.println(a+" "+b+" "+c);
    }
        
}
