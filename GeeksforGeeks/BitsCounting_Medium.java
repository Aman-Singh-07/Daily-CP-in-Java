// https://www.geeksforgeeks.org/problems/bits-counting/1?page=2&difficulty=Medium&status=unsolved&sortBy=accuracy


class Solution {
    public static ArrayList<Integer> countBits(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            list.add(Integer.bitCount(i));
        }
        return list;
    }
}
