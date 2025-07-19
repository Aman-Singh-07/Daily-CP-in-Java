// https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1?page=3&sortBy=submissions


class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0) set.add(arr[i]);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        int res=1;
        for(int num:list){
            if(num==res){
                res++;
            }
            else break;
        }
        return res;
    }
}
