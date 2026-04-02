// https://codeforces.com/contest/2214/problem/C

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int[] arr=new int[3];
            for(int i=0;i<3;i++) arr[i]=input.nextInt();
            Arrays.sort(arr);
            System.out.println(((arr[0]^arr[1])^arr[2])-arr[1]);
        }
    }
}
