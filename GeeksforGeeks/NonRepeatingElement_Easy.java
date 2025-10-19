// https://www.geeksforgeeks.org/problems/non-repeating-element3958/1?page=4&category=Arrays,Mathematical,Strings,Bit%20Magic,Recursion&status=unsolved&sortBy=submissions

// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(map.get(num)==1){
                return num;
            }
        }
        return 0;
    }
}
