// https://www.geeksforgeeks.org/problems/construct-an-array-from-its-pair-sum-array/1

class Solution {
    public ArrayList<Integer> constructArr(int[] arr) {
        // code here
        int m=arr.length;
        int n=(int)((1+Math.sqrt(1+8.0*m))/2);
        ArrayList<Integer> res = new ArrayList<>();
        if(m==1){
            res.add(1);
            res.add(arr[0]-1);
            return res;
        }
        if(m==2){
            res.add(1);
            res.add(arr[0]-1);
            res.add(arr[1]-1);
            return res;
        }
        int a0=(arr[0]+arr[1]-arr[n-1])/2;
        int a1=arr[0]-a0;
        int a2=arr[1]-a0;
        res.add(a0);
        res.add(a1);
        res.add(a2);
        for(int i=3;i<n;i++){
            res.add(arr[i-1]-a0);
        }
        return res;
    }
}
