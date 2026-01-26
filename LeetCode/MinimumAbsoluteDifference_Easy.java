// https://leetcode.com/problems/minimum-absolute-difference/?envType=daily-question&envId=2026-01-26

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(Math.abs(arr[i]-arr[i+1]),min);
        }
        for(int i=0;i<arr.length-1;i++){
                if(Math.abs(arr[i+1]-arr[i])==min && arr[i+1]>arr[i]){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[i+1]);
                    list.add(temp);
                }
            
        }
        return list;
    }
}
