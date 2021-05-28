package labthree;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenstring {

	public static void main(String[] args) {
	
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter integers");
		    String str=sc.nextLine();
		    System.out.println(str);
		    StringTokenizer st=new StringTokenizer(str," ");
		    int sum=0;
		    while(st.hasMoreTokens()) {
		    	System.out.println(st.nextToken());
		    	String temp=st.nextToken();
		    	int n=Integer.parseInt(temp);
		    	System.out.println(n);
		    	sum=sum+n;
		    }
		    System.out.println("and the sum is "+sum);
	}

}
