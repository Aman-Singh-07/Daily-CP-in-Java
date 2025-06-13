// https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&sortBy=submissions

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int num:arr){
            if(!set1.add(num)){
                set2.add(num);
            }
        }
        return new ArrayList<>(set2);
    }
}
