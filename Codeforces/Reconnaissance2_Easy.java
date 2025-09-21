//  https://codeforces.com/problemset/problem/34/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int pos1=0, pos2=1;
        int min=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<n;i++){
            int diff=Math.abs(arr[i]-arr[(i+1)%n]);
            if(diff<min){
                min=diff;
                pos1=i;
                pos2=(i+1)%n;
            }
        }
        System.out.println((pos1+1)+" "+(pos2+1));
    }
}
