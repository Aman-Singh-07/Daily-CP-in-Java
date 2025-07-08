// https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=3&status=unsolved&sortBy=submissions

class Solution {
    public void printNos(int n) {
        // Code here
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
