// https://www.codechef.com/problems/HIDIF?tab=ide

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
            }
            int original=0;
            for(int i=1;i<n;i++){
                original+=Math.abs(arr[i]-arr[i-1]);
            }
            int maxGain=0;
            for(int i=0;i<n;i++){
                int oldDiff=0;
                if(i>0) oldDiff+=Math.abs(arr[i]-arr[i-1]);
                if (i<n-1) oldDiff+=Math.abs(arr[i]-arr[i+1]);
                int newDiff1=0;
                if(i>0) newDiff1+=Math.abs(1-arr[i-1]);
                if(i<n-1) newDiff1+=Math.abs(1-arr[i+1]);
                int newDiffK=0;
                if(i>0) newDiffK+=Math.abs(k-arr[i-1]);
                if(i<n-1) newDiffK+=Math.abs(k-arr[i+1]);

                int gain=Math.max(newDiff1,newDiffK)-oldDiff;
                maxGain=Math.max(maxGain,gain);
            }

            System.out.println(original+maxGain);
        }
    }
}
