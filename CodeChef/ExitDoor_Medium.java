// https://www.codechef.com/problems/P3BAR

import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] pos=new int[n + 1];
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                pos[arr[i]]=i;
            }
            boolean[] isTrue=new boolean[n];
            Arrays.fill(isTrue,true);
            int count=0;
            for(int j=n;j>= 1;j--){
                int idx=pos[j];
                int left=0;
                for(int i=idx-1;i>=0;i--){
                    if (isTrue[i]) left++;
                }
                int right=0;
                for(int i=idx+1;i<n;i++){
                    if(isTrue[i]) right++;
                }
                count+=Math.min(left,right);
                isTrue[idx]=false; 
            }
            System.out.println(count);
        }
    }
}
