// https://www.geeksforgeeks.org/problems/distinct-difference--170647/1

class Solution {
    ArrayList<Integer> getDistinctDifference(int[] arr) {
        // code here
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            list1.add(set1.size());
            set1.add(arr[i]);
        }
        for(int i=arr.length-1;i>=0;i--){
            list2.add(set2.size());
            set2.add(arr[i]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            res.add(list1.get(i)-list2.get(arr.length-1-i));
        }
        return res;
    }
}
