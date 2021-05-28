package labthree;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
				System.out.println("enter number");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				String s=String.valueOf(num);
				char[] digits1 = s.toCharArray();
				int arr[]=new int[digits1.length];
				 //char ch[]= new char[s.length()];   
				int i;
		       for( i=0;i<digits1.length-1;i++) {
		    	   arr[i] = digits1[i]-digits1[i+1];
		    	   System.out.print(Math.abs(arr[i]));
		       }
				System.out.println(digits1[digits1.length-1]);
				}
	 

}
