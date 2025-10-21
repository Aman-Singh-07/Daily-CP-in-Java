// https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1

class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
         List<Map.Entry<Integer, Integer>> entryList=new ArrayList<>(map.entrySet());
        entryList.sort((a, b)->{
            if(!a.getValue().equals(b.getValue())) return b.getValue()-a.getValue();
            else  return b.getKey() - a.getKey();
        });
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            result.add(entryList.get(i).getKey());
        }

        return result;
    }
}
