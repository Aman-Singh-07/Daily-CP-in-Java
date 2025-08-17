// https://www.geeksforgeeks.org/problems/sort-by-absolute-difference-1587115621/1

class Solution {
    public void rearrange(int[] arr, int x) {
        Integer[] res=Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(res,(a,b)->{
            int diffA=Math.abs(a-x);
            int diffB=Math.abs(b-x);
            return Integer.compare(diffA,diffB);
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }
}
