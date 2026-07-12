// https://leetcode.com/problems/rank-transform-of-an-array/?envType=daily-question&envId=2026-07-12

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set=new TreeSet<>();
        int n=arr.length;
        for(int num:arr){
            set.add(num);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=1;
        for(int num:set){
            map.put(num,k++);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}
