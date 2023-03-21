package Day3;

public class Class {
	int sid;
	String sname;
	char grade; 
	  
	Class (int id,String name,char g)//constructor//
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void getvalues(int id,String name,char g)
	{
	 sid=id;
	 sname=name;
	 grade=g;
	}
	 
	
	void display()
	{
	System.out.println(sid+"  "+sname+"  "+grade);

}
}