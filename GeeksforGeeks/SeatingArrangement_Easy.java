// https://www.geeksforgeeks.org/problems/seating-arrangement--170647/1

class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        // code here
        int count=0;
        if(seats.length==1){
            if(seats[0]==1){
                if(k==0) return true;
                else return false;
            }else{
                return true;
            }
        }
        for(int i=0;i<seats.length;i++){
            if(i==0){
                if(seats[i]==0 && seats[i+1]==0){
                    count++;
                    seats[i]=1;
                }
            }
            else if(i<seats.length-1){
                if(seats[i-1]!=1 && seats[i]==0 && seats[i+1]==0){
                    seats[i]=1;
                    count++;
                }
            }else{
                if(seats[i]==0 && seats[i-1]==0){
                    seats[i]=1;
                    count++;
                }
            }
            if(count>=k) return true;
        }
        return false;
        
    }
}
