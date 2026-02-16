// https://www.geeksforgeeks.org/problems/rabin-karp-pattern-searching/1;

// User function Template for Java

class match {
    static int d = 256;

    // Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q) {
        // Your code here
        int m=pat.length();
        int n=txt.length();
        if(m>n) return false; 
        int i,j;
        int p=0;
        int t=0;
        int h=1;
        for(i=0;i<m-1;i++){
            h=(h*d)%q; // The Value Of h would be the pow(d,m-1)%q;
            
        }
        for(i=0;i<m;i++){
            p=(d*p+pat.charAt(i))%q;
            t=(d*t+txt.charAt(i))%q;
        }
        for(i=0;i<=n-m;i++){
            if(p==t){
                for(j=0;j<m;j++){
                    if(txt.charAt(i+j)!=pat.charAt(j)) break;
                }
                if(j==m) return true;
            }
            if(i<n-m){
                t=(d*(t-txt.charAt(i)*h) + txt.charAt(i+m))%q;
                if(t<0) t=t+q;
            }
        }
        return false;
        
    }
}
