// https://www.geeksforgeeks.org/problems/kth-distance3757/1

class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        // code here
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(!map.containsKey(num)){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(num,list);
            }else{
                int idx=map.get(num).getLast();
                if(i-idx<=k) return true;
                map.get(num).add(i);
            }
        }
        return false;
    }
}
