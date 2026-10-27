// https://leetcode.com/problems/create-grid-with-exactly-one-path/description/?envType=daily-question&envId=2026-10-27

class Solution {
    public String[] createGrid(int m, int n) {
        String[] res=new String[m];
        for(int i=0;i<m;i++){
            char[] ch=new char[n];
            if(i==0){
                for(int j=0;j<n;j++){
                    ch[j]='.';
                }
            }else{
                for(int j=0;j<n;j++){
                    if(j==n-1) ch[j]='.';
                    else ch[j]='#';
                }
            }
            res[i]=new String(ch);
        }
        return res;
    }
}
