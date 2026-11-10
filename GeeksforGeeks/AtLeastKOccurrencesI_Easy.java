// https://www.geeksforgeeks.org/problems/first-element-to-occur-k-times5150/1

class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==k) return num;
        }
        return -1;
    }
}
