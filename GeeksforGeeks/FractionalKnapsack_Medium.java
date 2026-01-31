// https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1?page=1&difficulty=Medium&status=unsolved&sortBy=submissions

import java.util.*;
class Solution{
    static class Item {
        int value, weight;
        double ratio;
        Item(int v, int w){
            value=v;
            weight=w;
            ratio=v*1.0/w;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n=val.length;
        List<Item> items=new ArrayList<>();
        for(int i=0;i<n;i++){
            items.add(new Item(val[i],wt[i]));
        }
        items.sort((a, b)->Double.compare(b.ratio,a.ratio));
        double res=0.0;
        for(Item it:items){
            if(capacity>=it.weight){
                res+=it.value;
                capacity-=it.weight;
            }else{
                res+=capacity*it.ratio;
                break;
            }
        }
        return res;
    }
}
