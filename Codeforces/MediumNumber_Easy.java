// https://codeforces.com/problemset/problem/1760/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int[] arr=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=input.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
    }
}
