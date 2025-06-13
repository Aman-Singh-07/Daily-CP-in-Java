// https://www.codechef.com/problems/CS2023_STK

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
        int max1=0;
        int max2=0;
        int max11=0;
        int max22=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                max1++;
            }
            else{
                max11=Math.max(max11,max1);
                max1=0;
            }
            if(b[i]!=0){
                max2++;
            }
            else{
                max22=Math.max(max22,max2);
                max2=0;
            }
        }
        max11=Math.max(max11,max1);
        max22=Math.max(max22,max2);
        System.out.println(max11==max22?"Draw":max11>max22?"Om":"Addy");
   
        }
    }
}
