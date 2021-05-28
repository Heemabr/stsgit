package labthree;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabets {
	static boolean isPostive(String s)
    {
        int n = s.length();
        char[] c = s.toCharArray();
        Arrays.sort(c);
   System.out.println(c);
        for (int i = 0; i < n; i++)
            if (c[i] != s.charAt(i)) {
                return false;
            }
        return true;    
    }
     
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter string");
        String s = sc.nextLine();
      
        if (isPostive(s.toUpperCase()))
           System.out.println("Yes");
        else
            System.out.println("No");
           
    }
}
