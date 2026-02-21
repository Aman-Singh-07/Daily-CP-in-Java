// https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=2&sortBy=submissions

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) temp.push(-1);
            else temp.push(s.peek());
            s.push(arr[i]);
        }
        while(!temp.isEmpty()) list.add(temp.pop());
        return list;
    }
}
