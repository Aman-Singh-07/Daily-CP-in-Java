// https://www.codechef.com/problems/GERALD04?tab=ide

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String[] s1=input.next().split(":");
            String[] s2=input.next().split(":");
            double dist=input.nextDouble();
            double t1=Double.parseDouble(s1[0])*60+Double.parseDouble(s1[1]);
            double t2=Double.parseDouble(s2[0])*60+Double.parseDouble(s2[1]);
            double diff=t1-t2;
            double plan1=diff+dist;
            double plan2;
            if(2*dist>diff){
                plan2=dist+diff/2.0;
            }else{
                plan2=diff;
            }
            System.out.printf("%.1f %.1f\n",plan1,plan2);
        }
    }
}
