// https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        Deque<Integer> dq=new LinkedList<Integer>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) dq.pollLast();
            dq.addLast(i);
            if(i>=k-1) list.add(arr[dq.peekFirst()]);
        }
        
        return list;
    }
}
