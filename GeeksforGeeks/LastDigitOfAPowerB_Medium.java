// https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1

class Solution {
    public int getLastDigit(String a, String b) {
        // code here
        if(b.equals("0")) return 1;
        int num=a.charAt(a.length()-1)-'0';
        if(b.length()==1) return power(num,Integer.parseInt(b)%4)%10;
        String sub=b.substring(b.length()-2);
        return power(num,Integer.parseInt(sub)%4)%10;
    }
    public static int power(int base,int exp){
        if(exp==0) exp=4;
        int res=1;
        while(exp>0){
            if(exp%2!=0) res=res*base;
            base=base*base;
            exp/=2;
        }
        return res;
    }
};
