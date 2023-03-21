package javaproject;

public class Reversev {
  
	public static void main(String args []) {
		
		String str="the quick brown fox";
		String rev="";
		
		   int len=str.length();
		   for(int i=len-1;i>=0;i--)
		   {
			   rev=rev+str.charAt(i);
		   }
		   
			   
				System.out.println("Reversed string is:"+rev);
						
			
}
}