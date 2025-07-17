// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/description/?envType=daily-question&envId=2025-06-22

class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb=new StringBuilder(s);
        if(s.length()%k!=0){
            int n=((s.length()/k)+1)*k;
            while(sb.length()<n){
                sb.append(fill);
            }
        }
        String st=sb.toString();
        int n=st.length();
        String[] res=new String[n/k];
        int j=0;
        for(int i=0;i<n;i+=k){
            res[j]=st.substring(i,k+i);
            j++;
        }
        return res;
        
    }
}
