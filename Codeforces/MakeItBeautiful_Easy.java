// https://codeforces.com/problemset/problem/1783/A

import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                set.add(arr[i]);
            }
            if(set.size()==1) System.out.println("NO");
            else{
                System.out.println("YES");
                Arrays.sort(arr);
                int left=0;
                int right=arr.length-1;
                while(left<=right){
                    System.out.print(arr[left]+" ");
                    if(left!=right){
                        System.out.print(arr[right]+" ");
                    }
                    left++;
                    right--;
                }
                System.out.println();
            }
        }
    }
}
