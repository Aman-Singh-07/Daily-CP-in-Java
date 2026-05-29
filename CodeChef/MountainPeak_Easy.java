// https://www.codechef.com/problems/DSCPPAS269P

public static int[] nextHigherPeak(int[] heights) {
    // Write your code here
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.add(heights[heights.length-1]);
    int[] arr=new int[heights.length];
    for(int i=heights.length-1;i>=0;i--){
        while(!pq.isEmpty() && pq.peek()<=heights[i]) pq.poll();
        if(pq.isEmpty()) arr[i]=-1;
        else arr[i]=pq.peek();
        pq.add(heights[i]);
    }
    return arr;
}
