package Day6PKG;

public class Animal {

	public Animal()
	{
		System.out.println("Animal is created");
	}
	
	String color="White";
	void eating()
	{
		System.out.println("meat");
	}
	
}

class Dog extends Animal{
	
	public Dog()
	{
		super();
		System.out.println("Dog is created");
	}
	
	String color="Black";
	void displayColor1()
	{
		System.out.println(color);
		//System.out.println(super.color);
	}
	
	void displayColor2()
	{
		//System.out.println(color);
		System.out.println(super.color);
	}
	
	void eating()
	{
		System.out.println("bread");
		super.eating();
	}
	
}