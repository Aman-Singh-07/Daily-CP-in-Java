// https://www.codechef.com/problems/SETSK?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t--> 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] arr = new int[n];
            int count1 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] == 1) count1++;
            }
            boolean isTrue = true;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] == 1 && (j - i <= k)) {
                            isTrue = false;
                            break;
                        }
                    }

                }
                else {
                    boolean foundOne = false;
                    int start = Math.max(0, i - k);
                    int end = Math.min(n - 1, i + k);

                    for (int j = start; j <= end; j++) {
                        if (arr[j] == 1) {
                            foundOne = true;
                            break;
                        }
                    }
                    if (!foundOne) {
                        isTrue = false;
                    }
                }
            }
            System.out.println(isTrue && count1 != 0 ? "Yes" : "No");
        }

    }
}
