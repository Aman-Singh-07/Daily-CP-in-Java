// https://www.codechef.com/problems/ADJHATE

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
            int countOdd = 0;
            int countEven = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (arr[i] % 2 == 0) countEven++;
                else countOdd++;
            }
            if (countOdd == 0 || countEven == 0) System.out.println("-1");
            else {
                int i = -1;
                for (int j = 0; j < n; j++) {
                    if (arr[j] % 2 != 0) {
                        i++;
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
                for (int num: arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        }

    }
}
