// https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1?page=7&sortBy=submissions


class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num-x) || set.contains(num+x)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
