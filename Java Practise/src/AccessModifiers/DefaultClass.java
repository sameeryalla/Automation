package AccessModifiers;


class B{
	int data=10;
	void m1()
	{
		System.out.println("This is m1 method from class A");
	}
	
}


public class DefaultClass {

	public static void main(String[] args) {
		
		B objB=new B();
        objB.data=20;
        System.out.println(objB.data);

	}

}
