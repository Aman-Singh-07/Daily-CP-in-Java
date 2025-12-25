// https://www.geeksforgeeks.org/dsa/find-number-pairs-xy-yx/

class Solution {
    public int countPairs(int x[], int y[]) {
        // code here
        Arrays.sort(y);
        int m=y.length;
        int[] countY=new int[5];
        for(int num:y) if(num<5) countY[num]++;
        int res=0;
        for(int num:x) res+=countForX(num,y,countY,m);
        return res;
    }
    
    public int countForX(int x,int[] y,int[] countY,int m){
        if(x==0) return 0;
        if(x==1) return 0;
        int idx=Arrays.binarySearch(y,x);
        if(idx<0) idx=-(idx+1);
        else while(idx<m && y[idx]==x) idx++;
        int res=m-idx;
        res+=countY[1];
        if(x==2) res-=(countY[3]+countY[4]);
        if(x==3) res+=countY[2];
        return res;
    }
}
