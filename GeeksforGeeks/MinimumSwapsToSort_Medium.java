// https://www.geeksforgeeks.org/problems/minimum-swaps/1?page=3&status=unsolved&sortBy=submissions

class Solution {
    public int minSwaps(int arr[]){
        int n=arr.length;
        int[] sorted=arr.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        int swaps=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=sorted[i]){
                swaps++;
                int init=arr[i];
                int targetIdx=map.get(sorted[i]);
                arr[i]=arr[targetIdx];
                arr[targetIdx]=init;
                map.put(init,targetIdx);
                map.put(arr[i],i);
            }
        }
        return swaps;
    }
}
