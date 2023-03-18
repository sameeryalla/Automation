package FirstDayPKG;

public class OperatorsinJava {
	
	public static void main(String args[])
	{
		
		int a =10;
		System.out.println("value of a: "+a);
		int b=2;
		System. out.println("value of b: "+b);
		int c=a+b;
		System.out.println("addition of a & b: "+c);
		c=a-b;
		System.out.println("substraction of a & b: "+c);		
		c=a*b;
		System.out.println("multiplication of a & b: "+c);
		c=a/b;
		System.out.println("division of a & b: "+c);
		a++;
		System.out.println("value of a: "+a);
		c=a%b;
		System.out.println("reminder of a & b: "+c);
		
		if (a==b)
		{
			System.out.println("Both a and b has same values");
		}
		else if(a>=b && b>c)
		{
			System.out.println("a is greater than b and b is greater than c");
		}
		else if(a<b)
		{
			System.out.println("b is greater than a");	
		}
	}
	

}
