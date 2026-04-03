// https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1?page=9&status=unsolved&sortBy=submissions

class Solution {
    public static void print_divisors(int n) {
        // code here
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                set.add(i);
                set.add(n/i);
            }
        }
        for(int num:set) System.out.print(num+" ");
    }
}
