// https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1?page=2&status=unsolved&sortBy=submissions

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n=start.length;
        int[][] room=new int[n][2];
        for(int i=0;i<n;i++){
            room[i][0]=start[i];
            room[i][1]=end[i];
        }
        Arrays.sort(room,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int lastend=room[0][1];
        for(int i=1;i<n;i++){
            if(room[i][0]>lastend){
                count++;
                lastend=room[i][1];
            }
        }
        return count;
    }
}
