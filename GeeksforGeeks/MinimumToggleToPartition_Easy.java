// https://www.geeksforgeeks.org/problems/minimum-toogles-to-partition0135/1

class Solution {
    int minToggle(int[] arr) {
        int n=arr.length;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+arr[i];
        }
        int res=n;
        int[] suffix=new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0) suffix[i]=suffix[i+1]+1;
            else suffix[i]=suffix[i+1];
        }
        for(int i=0;i<=n;i++){
            int sum=prefix[i]+suffix[i];
            res=Math.min(res,sum);
            
        }
        return res;
        
        
    }
}
