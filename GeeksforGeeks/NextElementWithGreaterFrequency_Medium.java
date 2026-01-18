// https://www.geeksforgeeks.org/problems/next-element-with-greater-frequency--170637/1

class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr) list.add(-1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
           while(!stack.isEmpty() && map.get(arr[i])>map.get(arr[stack.peek()])){
               int index=stack.pop();
               list.set(index,arr[i]);
           }
           stack.push(i);
        }
        return list;
    }
}
