// https://codeforces.com/problemset/problem/472/A

import java.util.*;
public class oddDivisor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        boolean[] isComposite=new boolean[n+1];
        Arrays.fill(isComposite,false);
        for(int i=2;i*i<=n;i++){
            if(!isComposite[i]){
                for(int j=i*i;j<=n;j+=i){
                    isComposite[j]=true;
                }
            }
        }
        boolean found=false;
        for(int i=4;i<=n/2;i++){
            int j=n-i;
            if(j>=4 && isComposite[i] && isComposite[j]){
                System.out.println(i+ " "+j);
                found=true;
                break;
            }
        }
    }
}
