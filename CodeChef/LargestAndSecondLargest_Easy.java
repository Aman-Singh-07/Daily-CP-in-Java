// https://www.codechef.com/problems/LARGESECOND

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int largest=a[0];
            int secondLargest=a[1];
            for(int i=0;i<n;i++){
                if(a[i]!=largest){
                    secondLargest=a[i];
                    break;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]>largest){
                    secondLargest=largest;
                    largest=a[i];
                }
                if(a[i]>secondLargest && a[i]<largest){
                    secondLargest=a[i];
                }
            }
            System.out.println(largest+secondLargest);
            
        }
    }
}
