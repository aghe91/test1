package javaproject;

public class Camelcase {
    public static void main(String args[]) {
    	
    	String s="in java naming you have to respect camel case";
    	String [] arr=s.split(" ");
    	
    	for(int i=0;i<arr.length;i++) {
    		char c=arr[i].charAt(0);
    		String c1=String.valueOf(c).toUpperCase();
    		String sub=arr[i].substring(1);
    	
    	
    	
		System.out.println(c1+sub +" ");
    		
    	
}
}
}