package Day7PKG;

public class Test implements InterfaceImpl{

     public void rule1()
     {
    	 System.out.println("Method implementation1");
     }
     
     public void rule2()
     {
    	 System.out.println("Method implementation2");
     }
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.rule1();
		t.rule2();
         
		InterfaceImpl a=new Test();
		a.rule1();
		//a.rule2();//this object cant access this method
		
	}

}
