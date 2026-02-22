// https://www.geeksforgeeks.org/problems/maximum-of-minimum-for-every-window-size3453/1

class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) left[i]=-1;
            else left[i]=s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) right[i]=arr.length;
            else right[i]=s.peek();
            s.push(i);
        }
        int[] res=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            int windowSize=right[i]-left[i]-1;
            res[windowSize]=Math.max(res[windowSize],arr[i]);
        }
        for(int i=arr.length-1;i>=1;i--){
            res[i]=Math.max(res[i],res[i+1]);
        }
        for(int i=1;i<=arr.length;i++) list.add(res[i]);
        return list;
    }
}
