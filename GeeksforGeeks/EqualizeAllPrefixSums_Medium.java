// https://www.geeksforgeeks.org/problems/optimal-array--170647/1

class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=1;i<arr.length;i++){
            int sum=list.get(i-1)+(arr[i]-arr[i/2]);
            list.add(sum);
        }
        return list;
    }

}
