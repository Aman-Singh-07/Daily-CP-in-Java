// https://www.geeksforgeeks.org/problems/k-closest-elements3619/1

class Solution {
    int[] printKClosest(int[] arr, int k, int x) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=x){
                map.put(arr[i],Math.abs(arr[i]-x));
            }
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return Integer.compare(a.getValue(),b.getValue());
            }
            return Integer.compare(b.getKey(),a.getKey());
        });
        int[] res=new int[k];
        for(int i=0;i<k && i<list.size();i++){
            res[i]=list.get(i).getKey();
        }
        return res;
    }
}
