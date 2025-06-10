// https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&sortBy=submissions

// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        int repeating=0;
        for(int i:arr){
            if(set.contains(i)){
                repeating=i;
            }
            sum+=i;
            set.add(i);
        }
        int n=arr.length;
        long totalSum=(long)n*(n+1)/2;
        long missing =totalSum-(sum-repeating);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(repeating);
        list.add((int)missing);
        return list;
    }
}
