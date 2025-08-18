// https://leetcode.com/problems/maximum-swap/description/?envType=problem-list-v2&envId=n32iyzu3

class Solution {
    public int maximumSwap(int num) {
        char[] s=String.valueOf(num).toCharArray();
        char[] temp=String.valueOf(num).toCharArray();
        char max=temp[temp.length-1];
        for(int i=temp.length-1;i>=0;i--){
            if(temp[i]>max) max=temp[i];
            else temp[i]=max;
        }
        char max1=0;
        char max2=0;
        for(int i=0;i<temp.length;i++){
            if(s[i]<temp[i]){
                max1=s[i];
                max2=temp[i];
                s[i]=temp[i];
                break;
            }
        }

        for(int i=s.length-1;i>=0;i--){
            if(s[i]==max2){
                s[i]=max1;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:s){
            sb.append(ch);
        }
        return Integer.valueOf(sb.toString());
        
    }
}
