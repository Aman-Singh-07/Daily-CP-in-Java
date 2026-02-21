// https://www.codechef.com/problems/SUSSTR

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
		    int n=input.nextInt();
		    String s=input.next();
		    if(n==1){
		        System.out.println("s");
		        continue;
		    }
		    int i=1;
		    int j=s.length()-1;
		    Node ptr=new Node(s.charAt(0));
		    Node head=ptr;
		    int k=0;
		    while(i<=j){
		        if(k%2==0){
		            if(s.charAt(j)=='1'){
		                Node curr=new Node('1');
		                curr.next=head;
		                head=curr;
		            }else{
		                Node curr=new Node('0');
		                ptr.next=curr;
		                ptr=curr;
		            }
		            k=1;
		            j--;
		        }
		        else{
		            if(s.charAt(i)=='0'){
		                Node curr=new Node('0');
		                curr.next=head;
		                head=curr;
		            }else{
		                Node curr=new Node('1');
		                ptr.next=curr;
		                ptr=curr;
		            }
		            k=0;
		            i++;
		        }
		    }
		    
		    StringBuilder sb=new StringBuilder();
		    while(head!=null){
		        sb.append(head.ch);
		        head=head.next;
		    }
		    System.out.println(sb.toString());
		}

	}
	
	static class Node{
	    char ch;
	    Node next;
	    Node(char c){
	        ch=c;
	        next=null;
	    }
	}
}
