package Day7PKG;

interface A1{
	int x=100;
	void m1();
}

interface A2{
	int y=100;
	void m2();
}

interface A3{
	int z=100;
	void m3();
}

public class MultipleInheritenceTest implements A1,A2,A3{
	
	public void m1()
	{
		System.out.println("Method implementation1");
	}
	
	public void m2()
	{
		System.out.println("Method implementation2");
	}

	public void m3()
	{
		System.out.println(z);
	}
	public static void main(String[] args) {
		
		MultipleInheritenceTest mit=new MultipleInheritenceTest();
		mit.m1();
		mit.m2();
		mit.m3();

	}

}
