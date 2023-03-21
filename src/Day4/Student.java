package Day4;

public class Student {
	int sid;
	String sname;
	
	char sub1;
	String sub2;
	float sub3;
	  
	void Display(){
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
	
	void getStuMarks(char SUB1,String SUB2,float SUB3) {
		
		sub1=SUB1;
		sub2=SUB2;
		sub3=SUB3;
		
		
		System.out.println(sub1+ " " + sub2 + " "+ sub3);
		
	}
	
	


}
