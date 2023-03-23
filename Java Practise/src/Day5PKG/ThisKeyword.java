package Day5PKG;

public class ThisKeyword {

	int a,b; //instance variablles or class vaiables
	
	void getValues(int a, int b)//x and y are method variables or parameters
	{
		this.a=a;
		this.b=b;
	}
	
	void printValues()
	{
			System.out.println(+a+" "+b);
	}
	 
	public static void main(String[] args) {
	
		ThisKeyword tk=new ThisKeyword();
		tk.getValues(20,30);
		tk.printValues();

	}

}
