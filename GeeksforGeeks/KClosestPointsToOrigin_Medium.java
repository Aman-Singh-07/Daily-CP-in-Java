// https://www.geeksforgeeks.org/problems/k-closest-points-to-origin--172242/1

class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        Map<int[],Double> map=new HashMap<>();
        for(int[] arr:points){
            double dis=Math.pow(arr[0],2)+Math.pow(arr[1],2);
            map.put(arr,dis);
        }
        List<Map.Entry<int[],Double>> sortedEntries=new ArrayList<>(map.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue());
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            int[] point=sortedEntries.get(i).getKey();
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(point[0]);
            temp.add(point[1]);
            result.add(temp);
        }
        return result;
    }
}
