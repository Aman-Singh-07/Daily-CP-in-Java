// https://www.codechef.com/problems/LCMXE?tab=statement

import java.util.Scanner;

class Codechef {
    public static int[] arr=new int[1000001];
    public static long[] exact=new long[1000001];
    public static long[] pref=new long[1000001];

    public static void main(String[] args) {
        precompute();
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            long z=input.nextInt();
            long totalPairs=z*z;
            long invalidPairs=pref[(int) z];
            System.out.println(totalPairs-invalidPairs);
        }
    }
    public static void precompute(){
        int maxZ=1000000;
        for(int i=1;i<=maxZ;i++){
            arr[i]=i;
        }
        for(int i=2;i*i<=maxZ;i++){
            if(arr[i]==i){
                for(int j=i*i;j<=maxZ;j+=i){
                    if(arr[j]==j){
                        arr[j]=i;
                    }
                }
            }
        }

        exact[1]=1;
        for(int n=2;n<=maxZ;n++){
            int p=arr[n];
            int x=n;
            int e=0;

            while(x%p==0){
                e++;
                x/=p;
            }
            exact[n]=exact[x]*(2*e+1);
        }

        for(int i=1;i<=maxZ;i++){
            pref[i]=pref[i-1]+exact[i];
        }
    }
}
