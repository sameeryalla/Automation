package Day4PKG;

public class Student {
	
	int sid;
	String sname;
	char sgrade;
	
	
	public Student(int id,String name,char grade)
	{
		this.sid=id;
		this.sname=name;
		this.sgrade=grade;
	}
	
	void getValues(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
		display();
	}
	
	void display()
	{
		System.out.println("Student Name: "+sname+",Student ID: "+sid+" and Student Grade: "+sgrade);
	}

}
