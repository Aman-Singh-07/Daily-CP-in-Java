// https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        for(int i=k;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0) map.remove(arr[i-k]);
            list.add(map.size());
        }
        return list;
        
    }
}
