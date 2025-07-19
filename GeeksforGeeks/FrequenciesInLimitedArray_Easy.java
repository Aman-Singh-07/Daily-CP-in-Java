//  https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?page=3&sortBy=submissions

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            if(num>=1 && num<=n){
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        for(int i=1;i<=n;i++){
            list.add(map.getOrDefault(i,0));
        }
        return list;
    }
}
