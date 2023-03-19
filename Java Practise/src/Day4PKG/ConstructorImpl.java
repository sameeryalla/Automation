package Day4PKG;

public class ConstructorImpl {

	int x;
	int y;
	
	public ConstructorImpl()
	{
		x=20;
		y=30;
	}
	public ConstructorImpl(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void sub()
	{
		System.out.println("Sum is "+(y-x));
	}
	
	void sum()
	{
		System.out.println("Sum is "+(x+y));
	}
	public static void main(String[] args) {

		ConstructorImpl conimpl1=new ConstructorImpl();
		conimpl1.sum();
		
		ConstructorImpl conimpl2=new ConstructorImpl(100,200);
		conimpl2.sum();
		conimpl2.sub();
	}

}
