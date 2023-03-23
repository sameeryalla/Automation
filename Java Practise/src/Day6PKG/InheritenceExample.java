package Day6PKG;


class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}


class B extends A //B is child class and A is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
		a=27;//parent variable accessing in child
		display();//parent method accessing in child
	}
}

class C extends B
{
	int c;
	void show()
	{
		System.out.println(c);
		a=27;//parent variable accessing in child
		display();//parent method accessing in child
		b=21;//parent variable accessing in child
		print();//parent method accessing in child
	}
}

public class InheritenceExample {

	public static void main(String[] args) {
		
		/*A aObj=new A();
        aObj.a=10;
        aObj.display();
        
        B bObj=new B();
        bObj.b=23;
        bObj.print();
        bObj.a=25;//parent variable accessing using child object
        bObj.display();//parent method accessing using child object
        */
		
		C cObj=new C();
		cObj.c=13;
		cObj.show();
		cObj.a=11;
		cObj.b=12;
		cObj.display();
		cObj.print();
        
	}

}
