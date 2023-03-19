package Day5PKG;

public class MethodOverloading {

	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		
		MethodOverloading mol=new MethodOverloading();
		mol.add(10.05,19.95);
		mol.add(2, 2.5);
		mol.add(1, 2, 3);
	
	}
	
}
