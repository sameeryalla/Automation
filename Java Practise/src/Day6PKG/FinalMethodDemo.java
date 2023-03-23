package Day6PKG;

final class Bike //we can't extened class when we declare as final
{
	final void run() //we can't create same method in child since final wont allow
	{
		System.out.println("Parent");
	}
	
}

/*class Honda extends Bike
{
	void run1()
	{
		System.out.println("Child");
	}
	
}*/

class Honda
{
	void run()
	{
		System.out.println("Child");
	}
	
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		
		Honda h=new Honda();
		h.run();
		Bike b=new Bike();
		b.run();

	}

}
