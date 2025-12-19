// https://www.geeksforgeeks.org/problems/bus-conductor--170647/1?page=1&difficulty=Easy&status=unsolved&sortBy=difficulty

class Solution {
    public int findMoves(int[] chairs, int[] passengers) {
        // code here
        Arrays.sort(chairs); 
        Arrays.sort(passengers); 
        int moves = 0;
        
        for (int i = 0; i < chairs.length; i++) { 
            moves += Math.abs(chairs[i] - passengers[i]); 
        } 
        return moves;
    }
}
