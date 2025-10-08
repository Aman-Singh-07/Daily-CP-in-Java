// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=daily-question&envId=2025-10-08

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr=new int[spells.length];
        Arrays.sort(potions);
        int n=spells.length, m=potions.length;
        for(int i=0;i<n;i++){
            long minPotion=(success+spells[i]-1)/spells[i]; 
            int index=left(potions,minPotion);
            arr[i]=m-index;
        }
        return arr;
    }

    public static int left(int[] arr,long k){
        int l=0,r=arr.length;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<k) l=mid+1;
            else r=mid;
        }
        return l;
    }
}
