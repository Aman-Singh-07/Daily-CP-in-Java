// https://www.geeksforgeeks.org/problems/previous-greater-element/1

class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()) list.add(-1);
            else list.add(s.peek());
            s.push(arr[i]);
        }
        return list;
    }
}
