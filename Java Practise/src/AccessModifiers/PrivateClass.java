package AccessModifiers;


class A{
	private int data=10;
	private void m1()
	{
		System.out.println("This is m1 method from class A");
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}

public class PrivateClass {

	
	public static void main(String[] args) {
        A objA=new A();
        objA.setData(20);
        System.out.println(objA.getData());

	}

}
