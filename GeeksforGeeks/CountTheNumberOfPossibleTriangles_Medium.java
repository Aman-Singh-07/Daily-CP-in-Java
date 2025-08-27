// https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1

class Solution {
    public int countTriangles(int arr[]) {
        int n=arr.length;
        Arrays.sort(arr); 
        int count=0;
        for(int i=n-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                if(arr[left]+arr[right]>arr[i]){
                    count+=(right-left);
                    right--;
                }else{
                    left++;
                }
            }
        }

        return count;
    }
}
