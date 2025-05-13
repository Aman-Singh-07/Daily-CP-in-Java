// https://codeforces.com/problemset/problem/155/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(); 
        int[] scores=new int[n];
        for(int i=0;i<n;i++){
            scores[i]=input.nextInt();
        }
        int amazingCount=0;
        int best=scores[0];
        int worst=scores[0];   
        for(int i=1;i<n;i++){
            if (scores[i]>best){
                amazingCount++;
                best=scores[i];
            } else if(scores[i]<worst){
                amazingCount++;
                worst=scores[i];
            }
        }
        System.out.println(amazingCount);
    }
}
