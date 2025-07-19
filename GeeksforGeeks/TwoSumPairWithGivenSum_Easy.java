// https://www.geeksforgeeks.org/problems/key-pair5616/1?page=3&sortBy=submissions

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            int req=target-num;
            if(set.contains(req)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
