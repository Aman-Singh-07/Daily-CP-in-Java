// https://codeforces.com/problemset/problem/785/A

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        while(n-->0){
            String s=input.next();
            if(s.equals("Tetrahedron")) count+=4;
            else if(s.equals("Cube")) count+=6;
            else if(s.equals("Octahedron")) count+=8;
            else if(s.equals("Dodecahedron")) count+=12;
            else if(s.equals("Icosahedron")) count+=20;
        }
        System.out.println(count);
    }
}
