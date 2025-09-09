// https://www.codechef.com/problems/CNOTE?tab=statement

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int x=input.nextInt();
            int y=input.nextInt();
            int k=input.nextInt();
            int n=input.nextInt();
            boolean isTrue=false;
            for(int i=0;i<n;i++){
                int a=input.nextInt();
                int b=input.nextInt();
                if (a>=(x-y) && b<=k){
                    isTrue=true;
                }
            }
            System.out.println(isTrue? "LuckyChef" : "UnluckyChef");
        }
    }
}
