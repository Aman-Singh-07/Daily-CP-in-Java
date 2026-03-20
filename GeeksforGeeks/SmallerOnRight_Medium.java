// https://www.geeksforgeeks.org/problems/smaller-on-right/0

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int count=0;
            TreeSet<Integer> set=new TreeSet<>();
            for(int i=n-1;i>=0;i--){
                set.add(arr[i]);
                count=Math.max(count,set.headSet(arr[i]).size());
            }
            System.out.println(count);
        }
    }
}
