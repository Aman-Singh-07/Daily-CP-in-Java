// https://www.geeksforgeeks.org/problems/find-unique-number/1?page=4&status=unsolved&sortBy=submissions

class Solution {
    public int findUnique(int[] arr) {
        // code here
        int sum1=0;
        int sum2=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
            sum1+=num;
        }
        for(int num:set){
            sum2+=+num+num;
        }
        return sum2-sum1;
    }
}
