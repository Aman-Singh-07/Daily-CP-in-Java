// https://www.geeksforgeeks.org/problems/pattern-search-kmp/1

class match {
    // Function to fill lps[] for given patttern pat[0..M-1].
    void computeLPSArray(String pat, int m, int lps[]) {
        // Your code here
        int len=0;
        int i=1;
        lps[0]=0;
        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=len;
                    i++;
                    
                }
            }
        }
        
    }

    // Function to check if the pattern exists in the string or not.
    boolean KMPSearch(String pat, String txt) {
        
        // Your code here
        int m=pat.length();
        int n=txt.length();
        int lps[]=new int[m];
        int j=0;
        computeLPSArray(pat,m,lps);
        int i=0;
        while((n-i)>=(m-j)){
            if(pat.charAt(j)==txt.charAt(i)){
                j++;
                i++;
            }
            if(j==m){
                return true;
            }else if(i<n && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0) j=lps[j-1];
                else i=i+1;
            }
        }
        return false;
    }
}
