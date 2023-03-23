package Day6PKG;

class ParentBank
{
	int a;
	void display()
	{
		System.out.println(a);
	}
	
	double rateOfInterest()
	{
		return 0;
	}
}

class ChildBank1 extends ParentBank
{
	int b;
	void show()
	{
		System.out.println(b);
	}
	
	double rateOfInterest()
	{
		return 1;
	}
	
}

class ChildBank2 extends ParentBank
{
	int c;
	void print()
	{
		System.out.println(c);
	}
	
	double rateOfInterest()
	{
		return 2;
	}
}

class ChildBank3 extends ParentBank
{
	int d;
	void print()
	{
		System.out.println(d);
	}
	
	double rateOfInterest()
	{
		return 3;
	}
}


public class OverridingExample {

	public static void main(String[] args) {
		
		ChildBank1 cb1=new ChildBank1();
		System.out.println(cb1.rateOfInterest());
		
		ChildBank2 cb2=new ChildBank2();
		System.out.println(cb2.rateOfInterest());
		

		ChildBank3 cb3=new ChildBank3();
		System.out.println(cb3.rateOfInterest());
		
		
		ParentBank pb=new ParentBank();
		System.out.println(pb.rateOfInterest());
	}

}
