package Day8PKG;

public class ExceptionExamples {

	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("Program started");
		int a=100;
		System.out.println("Initialized");
		System.out.println((a/100));
		System.out.println("First print executed");
		//System.out.println((a/0));
		try {
		System.out.println((a/0));}
		catch(ArithmeticException e)
		{
			System.out.println("Entered in to catch block1");
			e.printStackTrace();
		}
		String b=null;
		//System.out.println((b.length()));
		
		try {
			System.out.println((b.length()));}
			catch(NullPointerException e)
			{
				System.out.println("Entered in to catch block2");
				e.printStackTrace();
			}
		
		String x="abc";
		//int y=Integer.parseInt(x);
		//System.out.println(y);
		try {
			int y=Integer.parseInt(x);
			System.out.println(y);
			}catch(NumberFormatException e)
			{
				System.out.println("Entered in to catch block3");
				e.printStackTrace();
			}
		int arr[]=new int[5];
		//arr[10]=100;
		try {
			arr[10]=100;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Entered in to catch block4");
				e.printStackTrace();
			}
		finally {
			System.out.println("Finally block executed");
		}
		
		
	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("to be continued");
	}

}
