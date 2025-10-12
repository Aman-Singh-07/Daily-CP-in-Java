// https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1?page=10&status=unsolved&sortBy=submissions

class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        int[] res=new int[2];
        int k=0;
        for(int num:arr){
            if(set.contains(num)){
                res[k]=num;
                k++;
            }
            set.add(num);
        }
        return res;
    }
}
