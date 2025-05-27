// https://codeforces.com/problemset/problem/758/A

import java.util.*;
public class Equality{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        int[] arr=new int[t];
        int max=0;
        int count=0;
        for(int i=0;i<t;i++){
            arr[i]=input.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<t;i++){
            count+=max-arr[i];
        }
        System.out.println(count);
    }
}
