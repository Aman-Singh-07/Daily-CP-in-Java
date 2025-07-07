// https://www.geeksforgeeks.org/problems/first-repeating-element4018/1?page=6&sortBy=submissions

class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1){
                return i+1; 
            }
        }
        return -1;
    }
}
