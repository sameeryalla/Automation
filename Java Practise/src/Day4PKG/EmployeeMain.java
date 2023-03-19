package Day4PKG;

public class EmployeeMain {

	
public static void main(String[] args) {
		
		OopsConcepts o=new OopsConcepts();
		o.setEid(1600802);
		o.ename="Sameer Yalla";
		o.sal=87671;
		o.role="Test Manager";
		o.dept="CCIB";
		o.display();
		
		OopsConcepts e1=new OopsConcepts();
		e1.setEid(1600803);
		e1.ename="Ramu Yalla";
		e1.sal=37671;
		e1.role="Associate";
		e1.dept="CCIB";
		e1.display();

	}
}
