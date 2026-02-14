// https://www.codechef.com/problems/CORTSENT

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0){
		    int k=input.nextInt();
		    String[] s=new String[k];
		    boolean isTrue=true;
		    boolean isUpper=true;
		    boolean isLower=true;
		    for(int i=0;i<k;i++){
		        s[i]=input.next();
		        if(isTrue){
		            if(Character.isLowerCase(s[i].charAt(0))){
		                for(char ch:s[i].toCharArray()){
		                    if(!Character.isLowerCase(ch) || ch<'a'|| ch>'m'){
		                        isTrue=false;
		                        break;
		                    }
		                }
		                
		            }
		            else if(Character.isUpperCase(s[i].charAt(0))){
		                for(char ch:s[i].toCharArray()){
		                    if(!Character.isUpperCase(ch) || ch<'N'|| ch>'Z'){
		                        isTrue=false;
		                        break;
		                    }
		                }
		            }
		            
		            
		        }
		    }
		    System.out.println(isTrue?"YES":"NO");
		    
		}

	}
}
