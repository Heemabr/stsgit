package labthree;

public class Count {
	 public static void main(String[] args) {    
	        String string = "hello world";    
	        int count = 0;    
  
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }        
	        System.out.println("Total number of characters in a string: " + count);    
	        System.out.println(wordcount(string) + " words.");   
	    }    
	 static int wordcount(String string)  
     {  
       int count=0;  
   
         char ch[]= new char[string.length()];     
         for(int i=0;i<string.length();i++)  
         {  
             ch[i]= string.charAt(i);  
             if( ((i>0)&&(ch[i]!=' ') && (ch[i-1]==' ')) || ((ch[0]!=' ') && (i==0)) ) { 
                 count++;  
             }
         }  
         return count;  
     }  
}
