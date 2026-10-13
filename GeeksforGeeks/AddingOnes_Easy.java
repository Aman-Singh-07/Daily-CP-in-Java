// https://www.geeksforgeeks.org/problems/adding-ones3628/1

class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {
        // code here
        int[] arr=new int[n];
        for(int i=0;i<updates.length;i++){
            int j=updates[i]-1; 
            arr[j]++;
        }
        for(int i=0;i<n;i++) if(i>0) arr[i]+=arr[i-1];
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr) list.add(num);
        return list;
    }
}
