// https://www.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering--170645/1

class Solution {
    public int maxFruits(ArrayList<Integer> list, int m) {
        
        // code here
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        int max=0;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=arr[i];
        }
        max=Math.max(max,sum);
        for(int i=m;i<arr.length+m-1;i++){
            sum=sum-arr[i-m]+arr[i%arr.length];
            max=Math.max(max,sum);
        }
        return max;
    }
}
