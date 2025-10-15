// https://www.codechef.com/problems/NAME1?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String A=input.next();
            String B=input.next();
            String S=A+B;
            int n=input.nextInt();
            StringBuilder children=new StringBuilder();
            for(int i=0;i<n;i++){
                children.append(input.next());
            }
            int[] freqParents=new int[26];
            int[] freqChildren=new int[26];
            for(char c:S.toCharArray()){
                freqParents[c-'a']++;
            }
            for(char c:children.toString().toCharArray()) {
                freqChildren[c-'a']++;
            }
            boolean isPossible=true;
            for(int i=0;i<26;i++){
                if(freqChildren[i]>freqParents[i]){
                    isPossible=false;
                    break;
                }
            }

            System.out.println(isPossible?"YES":"NO");
        }
    }
}
