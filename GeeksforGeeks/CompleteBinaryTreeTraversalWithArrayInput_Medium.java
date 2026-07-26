// https://www.geeksforgeeks.org/problems/print-binary-tree-levels-in-sorted-order3241/1

class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            while(size-->0){
                int node=q.poll();
                
                if ((2 * node +1) < n) q.offer(2 * node +1);
                if ((2 * node +2) < n) q.offer(2 * node +2);
                
                level.add(arr[node]);
            }
            Collections.sort(level);
            res.add(level);
        }
        return res;
    }
}
