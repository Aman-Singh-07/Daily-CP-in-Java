// https://www.geeksforgeeks.org/problems/special-integers/1?page=7&sortBy=latest


class Solution {
    public static int specialIntegers(int n, int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr) set.add(num);
        int count=0;
        for(int num:set){
            if(set.contains(num+1) && set.contains(num-1)) count++;
        }
        return count;
    }
}
        
