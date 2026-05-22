// https://www.geeksforgeeks.org/problems/make-the-array-beautiful--170647/1

class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        for(int num:arr){
            if(stack.isEmpty()) stack.add(num);
            else{
                if(stack.peek()>=0){
                    if(num>=0) stack.add(num);
                    else stack.pop();
                }
                else{
                    if(num<0) stack.add(num);
                    else stack.pop();
                }
                
            }
        }
        int[] a=new int[stack.size()];
        int i=a.length-1;
        while(!stack.isEmpty()) a[i--]=stack.pop();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:a) list.add(num);
        return list;
        
    }
}
