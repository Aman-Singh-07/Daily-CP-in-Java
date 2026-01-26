// https://codeforces.com/problemset/problem/2189/A

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int t = input.nextInt();
            while (t-- > 0) {
                int n = input.nextInt();
                int h = input.nextInt();
                int l = input.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) a[i] = input.nextInt();

                int rowCount = 0;
                int colCount = 0;
                int usefulCount = 0; 

                for(int num:a){
                    boolean isRow=num<=h;
                    boolean isCol=num<=l;
                    if(isRow) rowCount++;
                    if(isCol) colCount++;
                    if(isRow||isCol) usefulCount++;
                }
                int maxPairs=Math.min(rowCount, colCount);
                maxPairs=Math.min(maxPairs,usefulCount/2);
                System.out.println(maxPairs);
            }
        }
    }
}
