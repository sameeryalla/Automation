package Day7PKG;

class D1{
	
	void m1()
	{
	System.out.println("This is m1 method from class A");
	}
}


interface B1{
	void m2();
}

interface C1{
	void m3();
}

public class HybridInterface extends D1 implements B1,C1 {

	
	public void m2()
	{
	System.out.println("This is m2 method from interface B1");
	} 
	
	public void m3()
	{
	System.out.println("This is m3 method from interface C1");
	}
	
	public static void main(String[] args) {
		HybridInterface hi=new HybridInterface();
		hi.m1();
		hi.m2();
		hi.m3();
	}

}
