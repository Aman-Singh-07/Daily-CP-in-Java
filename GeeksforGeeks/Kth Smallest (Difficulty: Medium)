 // https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&sortBy=submissions

// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        int res=0;
        int n=list.size();
        while(k-->0){
            int min=list.get(0);
            for(int i=1;i<n;i++){
                if(list.get(i)<min){
                    min=list.get(i);
                }
            }
            res=min;
            n--;
            list.remove(Integer.valueOf(min));
        }
        return res;
    }
}
