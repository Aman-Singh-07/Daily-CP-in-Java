// https://codeforces.com/problemset/problem/2191/A

import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            HashSet<Integer> set1=new HashSet<>();
            HashSet<Integer> set2=new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                if(i%2==0) set1.add(arr[i]);
                else set2.add(arr[i]);
            }
            Arrays.sort(arr);
            HashSet<Integer> set3=new HashSet<>();
            HashSet<Integer> set4=new HashSet<>();
            int n1=set1.size();
            int n2=set2.size();
            for(int i=0;i<n;i++){
                if(i%2==0) set3.add(arr[i]);
                else set4.add(arr[i]);
            }
            if(set3.equals(set1) || set4.equals(set1)) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
