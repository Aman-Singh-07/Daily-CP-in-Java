// https://www.geeksforgeeks.org/problems/candy/1

class Solution {
    public int minCandy(int arr[]) {
        int n=arr.length;
        int[] candies=new int[n];
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int res=0;
        for(int c:candies) res+=c;
        
        return res;
    }
}
