package Day5PKG;

public class StaticKeyword {

	
	static int a=10;//static variable
	int b=20;
	
	static void m1()//static method
	{
		System.out.println("This is static method");
		StaticKeyword sk2=new StaticKeyword();
		System.out.println(sk2.b);
		
	}
	
	void m2()//non-static method
	{
		System.out.println("This is non-static method");
	}
	
	void m3() //non static method
	{
		System.out.println(a);//accessing  static variable in non static method
		System.out.println(b);//accessing  non static variable in non static method
		m1();//accessing  static method in non static method
		m2();//accessing  non static method in non static method
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		//in other classes we can access static items as below.
		System.out.println(StaticKeyword.a);
		StaticKeyword.m1();
		
		//non static method
		StaticKeyword sk=new StaticKeyword();
		System.out.println(sk.b);
		sk.m2();
		
		sk.m3();

	}

}
