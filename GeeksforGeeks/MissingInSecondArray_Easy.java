// https://www.geeksforgeeks.org/problems/in-first-but-second5423/1
 
class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:b){
            set.add(num);
        }
        for(int num:a){
            if(!set.contains(num)) list.add(num);
        }
        return list;
    }
}
