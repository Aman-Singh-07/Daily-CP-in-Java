// https://codeforces.com/problemset/problem/1433/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int[] arr={1,11,111,1111,2,22,222,2222,3,33,333,3333,4,44,444,4444,5,55,555,5555,6,66,666,6666,7,77,777,7777,8,88,888,8888,9,99,999,9999};
            int[] sum={1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4,1,2,3,4};
            int req=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    req=i;
                    break;
                }
            }
            int reqSum=0;
            for(int i=0;i<=req;i++){
                reqSum+=sum[i];
            }
            System.out.println(reqSum);
        }
    }
}
