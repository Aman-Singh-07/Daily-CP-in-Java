//  https://www.geeksforgeeks.org/problems/subarrays-with-at-most-k-distinct-integers/1

class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int res=0;
        int l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while(map.size()>k){
                map.put(arr[l],map.getOrDefault(arr[l],0)-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            res+=(i-l+1);
        }
        return res;
    }
}
