// https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=3&sortBy=submissions

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        return set.size();
    }
}
