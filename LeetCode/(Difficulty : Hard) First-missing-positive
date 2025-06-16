//  https://leetcode.com/problems/first-missing-positive/description/

class Solution {
    public int firstMissingPositive(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                set.add(arr[i]);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return arr.length+1;
    }
}
