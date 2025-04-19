// https://codeforces.com/problemset/problem/339/A

import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String st=input.next();
        int[] arr=new int[(st.length()+1)/2];
        int index=0;
        for(int i=0;i<st.length();i+=2){
            arr[index]=(st.charAt(i))-'0';
            index++;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+"+");
        }
        System.out.println(arr[arr.length-1]);
    }
}
