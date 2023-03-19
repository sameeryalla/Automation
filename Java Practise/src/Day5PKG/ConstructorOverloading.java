package Day5PKG;

public class ConstructorOverloading {

	
	int a;
	int b;
	public ConstructorOverloading()
	{
		a=20;
		b=40;
		System.out.println(a+b);
	}
	
	public ConstructorOverloading(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public ConstructorOverloading(int a, double b)
	{
		System.out.println(a+b);
	}
	
	public ConstructorOverloading(double a, int b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {

		ConstructorOverloading col1=new ConstructorOverloading();
		ConstructorOverloading col2=new ConstructorOverloading(5,4);
		ConstructorOverloading col3=new ConstructorOverloading(5,4.67);
		ConstructorOverloading col4=new ConstructorOverloading(5.33,4);

	}

}
