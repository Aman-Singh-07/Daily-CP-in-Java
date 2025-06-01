// https://codeforces.com/problemset/problem/1512/A
 
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            int n=input.nextInt();
            int[] arr=new int[n];
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i]=input.nextInt();
                set.add(arr[i]);
            }
            int count1=0;
            int count2=0;
            int[] res=new int[2];
            int j=0;
            for(int i:set){
                res[j]=i;
                j++;
            }
            for(int i=0;i<n;i++){
                if(res[0]==arr[i]){
                    count1++;
                }
                else count2++;
            }
            int a=(count1>count2)?res[1]:res[0];
            for(int i=0;i<n;i++){
                if(arr[i]==a){
                    System.out.println(i+1);
                }
            }
            
        }
    }
}
