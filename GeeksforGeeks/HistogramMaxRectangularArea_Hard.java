// https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1

class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        Stack<Integer> s=new Stack<>();
        int[] l1=new int[arr.length];
        int[] l2=new int[arr.length];
        int max=0;
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) l1[i]=-1;
            else l1[i]=s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) l2[i]=arr.length;
            else l2[i]=s.peek();
            s.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int width=l2[i]-l1[i]-1;
            int area=arr[i]*width;
            max=Math.max(area,max);
        }
        return max;
        
        
    }
}
