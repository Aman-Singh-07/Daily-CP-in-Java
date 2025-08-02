// https://www.geeksforgeeks.org/problems/implement-strstr/1?page=6&status=unsolved&sortBy=submissions

class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        boolean isTrue=false;
        int res=-1;
        for(int i=0;i<txt.length()-pat.length();i++){
            if(txt.substring(i,pat.length()+i).equals(pat) && !isTrue){
                isTrue=true;
                res=i;
            }
        }
        if(!isTrue){
            if(txt.substring(txt.length()-pat.length(),txt.length()).equals(pat)){
                res=txt.length()-pat.length();
            }
        }
        return res;
        
    }
}
