// https://codeforces.com/problemset/problem/1560/A
 
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] res=new int[1000];
        int j=0;
        for(int i=1;i<=1666;i++){
            if(i%3==0 || i%10==3){
                continue;
            }
            res[j]=i;
            j++;
        }
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            System.out.println(res[n-1]);
        }
        
    }
}
