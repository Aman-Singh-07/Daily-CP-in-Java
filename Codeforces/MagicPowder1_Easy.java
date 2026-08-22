// https://codeforces.com/contest/670/problem/D1

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		int k = fs.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) a[i] = fs.nextInt();
		for (int i = 0; i < n; i++) b[i] = fs.nextInt();
		int res=0;
		while(true){
		    int need=0;
		    for(int i=0;i<n;i++){
		        if(b[i]>=a[i]) b[i]-=a[i];
		        else{
		            need+=(a[i]-b[i]);
		            b[i]=0;
		        }
		    }
	        if(need<=k){
	            res++;
	            k-=need;
	        }else break;
		}
		System.out.println(res);
	}
}
