// https://codeforces.com/contest/1538/problem/A

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int t = fs.nextInt();
        while (t--> 0){
            int n = fs.nextInt();
            List < Integer > list = new ArrayList < > ();
            for (int i = 0; i < n; i++) list.add(fs.nextInt());
            int max=list.indexOf(Collections.max(list));
            int min=list.indexOf(Collections.min(list));
            int maxi=Math.max(max, min);
            int mini=Math.min(max, min);
            int dif=Math.min(mini+1+(n-maxi),maxi+1);
            System.out.println(Math.min(dif,n-mini));
        }
    }
}
