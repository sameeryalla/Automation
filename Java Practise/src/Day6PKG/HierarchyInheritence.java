package Day6PKG;


class ParentA
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends ParentA
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class child2 extends ParentA
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}



public class HierarchyInheritence {

	
	public static void main(String[] args) {
		
		child1 c1=new child1();
		child2 c2=new child2();
		c1.a=100;
		c1.b=200;
		c1.display();
		c1.show();
		c2.a=150;
		c2.c=250;
		c2.display();
		c2.print();
		
	}

}
