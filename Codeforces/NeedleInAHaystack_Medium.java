// https://codeforces.com/contest/2174/problem/A

import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0){
            String s=input.next();
            String m=input.next();
            int[] freqs=new int[26];
            int[] freqm=new int[26];

            for(char i:s.toCharArray()){
                freqs[i-'a']++;
            }
            for(char i:m.toCharArray()) freqm[i-'a']++;
            boolean flag=false;
            for(int i=0;i<26;i++){
                freqm[i]=freqm[i]-freqs[i];
                if(freqm[i]<0){
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("Impossible");
                continue;
            }
            StringBuilder str=new StringBuilder();
            for(int i=0;i<26;i++){
                int count=freqm[i];
                while(count-->0) str.append((char)(i+97));
            }
            
            char[] ch1=s.toCharArray();
            char[] ch2=str.toString().toCharArray();

            StringBuilder sb =new StringBuilder();
            int i=0;
            int j=0;
            while(i<ch1.length && j<ch2.length){
                if(ch1[i]<=ch2[j]){
                    sb.append(ch1[i]);
                    i++;
                }
                else{
                    sb.append(ch2[j]);
                    j++;
                }
            }
            while(i<ch1.length){
                sb.append(ch1[i++]);
            }
            while(j<ch2.length) sb.append(ch2[j++]);
            System.out.println(sb);

        }
    }
}
