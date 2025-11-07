// https://www.codechef.com/problems/ROTATION?tab=statement

import java.util.*;

class Codechef {
    static int n;
    static int[] a;

    static int rotateClock(int x, int start) {
        start+=x;
        if(start>=n) start-=n;
        return start;
    }

    static int rotateAnticlock(int x, int start) {
        start-=x;
        if(start<0) start+=n;
        return start;
    }


    static int elementAt(int x,int start){
        int temp=start+x-1;
        if(temp>=n) temp-=n;
        return a[temp];
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int m=input.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        int start=0;
        while(m-->0){
            String op=input.next();
            int d=input.nextInt();
            if(op.equals("C")){
                start=rotateClock(d,start);
            }else if(op.equals("A")){
                start=rotateAnticlock(d,start);
            }else if (op.equals("R")){
                System.out.println(elementAt(d, start));
            }
        }
    }
}
