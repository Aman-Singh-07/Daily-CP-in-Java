// https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[][] arr=new int[map.size()][2];
        int i=0;
        for (Map.Entry<Integer, Integer> em : map.entrySet()) {
            arr[i][0]=em.getKey();
            arr[i][1]=em.getValue();
            i++;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        int[] res=new int[k];
        for(i=0;i<k;i++){
            res[i]=arr[i][0];
        }
        return res;
    }
}
