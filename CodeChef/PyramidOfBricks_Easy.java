// https://www.codechef.com/problems/BSEX02?tab=statement

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int count=0;
            int sum=0;
            for(int i=1;;i++){
                sum+=i;
                if(sum<=n) count++;
                else break;
            }
            System.out.println(count);
        }
    }
}
