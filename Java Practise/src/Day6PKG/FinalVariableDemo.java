package Day6PKG;

public class FinalVariableDemo {

	int speed=40;
	final int speedLimit=80;//we can't change this variable value since declared as final
	
	public static void main(String[] args) {
		
		FinalVariableDemo fvd=new FinalVariableDemo();
		fvd.speed=100;
		System.out.println(fvd.speed);
		//fvd.speedLimit=300;
		System.out.println(fvd.speedLimit);

	}

}
 