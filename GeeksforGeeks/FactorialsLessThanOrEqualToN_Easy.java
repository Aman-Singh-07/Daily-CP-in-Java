// https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/1?page=2&difficulty=Easy&status=unsolved&sortBy=submissions

// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> list=new ArrayList<>();
        
        long fact=1;
        long i=1;
        while(fact<=n){
            list.add(fact);
            i++;
            fact*=i;
        }
        return list;
    }
}
