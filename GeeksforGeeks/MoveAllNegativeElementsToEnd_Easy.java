// https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1?page=2&difficulty=Easy&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int k=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr[k++]=arr[i];
                
            }
            else{
                list.add(arr[i]);
            }
        }
        for(int num:list){
            arr[k++]=num;
        }
        
    }
}
