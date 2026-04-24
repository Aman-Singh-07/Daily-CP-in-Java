// https://www.geeksforgeeks.org/problems/buildings-receiving-sunlight3032/1

class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        int count=1;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                count++;
            }
        }
        return count;
    }
}
