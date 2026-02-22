// https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) list.add(i+1);
            else list.add(i-s.peek()); 
            s.push(i);
        }
        return list;
        
    }
}
