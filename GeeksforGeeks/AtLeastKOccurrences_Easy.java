// https://www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1?page=6&status=unsolved&sortBy=submissions

class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if (map.get(arr[i])==k) {
                return arr[i];
            }
        }
        return -1;
    }
}
