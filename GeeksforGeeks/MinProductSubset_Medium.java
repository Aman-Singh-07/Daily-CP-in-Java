// https://www.geeksforgeeks.org/problems/max-and-min-products3347/1

class Solution {
    public int minProd(int[] arr) {
        // code here
        int min=1;
        Arrays.sort(arr);
        int firstNegative=0;
        int count=0;
        for(int num:arr){
            if(num<0){
                firstNegative=num;
                count++;
            }
        }
        if(count%2!=0){
            for(int num:arr){
                if(num!=0) min*=num;
            }
        }else if(count%2==0 && count!=0){
            for(int num:arr){
                if(num==firstNegative){
                    firstNegative=-11;
                }
                else{
                    if(num!=0) min*=num;
                }
            }
        }
        else{
            min=arr[0];
        }
        return (int) min;
        
    }
}
