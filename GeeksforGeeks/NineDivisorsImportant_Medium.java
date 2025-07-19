// https://www.geeksforgeeks.org/problems/nine-divisors3751/1

class Solution {
    public static int countNumbers(int n) {
        // code here
        int count=0;
        int root=(int)Math.sqrt(n);
        int[] prime=new int[root+1];
        for(int i=1;i<=root;i++) prime[i]=i;

        for(int i=2;i*i<=root;i++){
            if(prime[i]==i){
                for(int j=i*i;j<=root;j+=i)
                    if(prime[j]==j)  prime[j] = i;
            }
        }
        for(int i=2;i<=root;i++){
            int a=prime[i];
            int b=prime[i/prime[i]];
            if(a*b==i && b!=1 && a!=b){
                count++;
            }
            else if(prime[i]==i && Math.pow(i,8)<=n){
                count++;
            }
        }

        return count;
    }
}
