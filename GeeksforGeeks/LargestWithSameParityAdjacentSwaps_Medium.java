// https://www.geeksforgeeks.org/problems/even-swap/1

class Solution {
    public ArrayList<Integer> lexicographicallyLargest(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length - 1; i++) {
            pq.add(arr[i]);
            if (arr[i] % 2 != arr[i + 1] % 2) {
                while (!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }
        }
        pq.add(arr[arr.length - 1]);
        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        return list;

    }
}
