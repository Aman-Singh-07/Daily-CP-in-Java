// https://www.geeksforgeeks.org/problems/count-element-occurences/1?page=3&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n=arr.length;
        int t=n/k;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int val:freq.values()){
            if(val>t){
                count++;
            }
        }
        return count;
    }
}
