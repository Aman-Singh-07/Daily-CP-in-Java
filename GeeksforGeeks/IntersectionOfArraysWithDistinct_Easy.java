// https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?page=1&difficulty=Easy&status=unsolved&sortBy=submissions

class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> arr=new HashSet<>();
        int count=0;
        for(int i=0;i<a.length;i++){
            arr.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            arr.add(b[i]);
        }
        return a.length+b.length-arr.size();
    }
}
