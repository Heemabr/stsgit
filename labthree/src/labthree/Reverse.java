package labthree;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter string");
		    String str=sc.nextLine();
		    System.out.println(str);
           Reverse o=new Reverse();
           System.out.println(str+"|"+o.getImage(str));
           
	}
public StringBuffer getImage(String str) {
	 StringBuffer str1=new StringBuffer(str);
	str1.reverse();
	return str1;
	
}
}
