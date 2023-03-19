package Day5PKG;

public class OverloadMainMethod {

	public static void main(String[] args) {
		OverloadMainMethod olm=new OverloadMainMethod();
        olm.main(2);
        olm.main(3, 4);
	}
	
	public void main(int x)
	{
		System.out.println(x);
	}
	public void main(int x, int y)
	{
		System.out.println(x+y);
	}

}
