// https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        TreeSet<Integer> set1=new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        for(int num:a) set1.add(num);
        for(int num:b) set2.add(num);
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:set1){
            if(set2.contains(num)) list.add(num);
        }
        return list;
    }
}
