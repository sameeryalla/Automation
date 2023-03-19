package Day4PKG;

public class OopsConcepts {
	
	 private int eid;
	String ename;
	double sal;
	String dept;
	String role;
	void display()
	{
		System.out.println("Employee id: "+getEid());
		System.out.println("Employee name: "+ename);
		System.out.println("Employee sal: "+sal);
		System.out.println("Employee dept: "+dept);
		System.out.println("Employee role: "+role);
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

	

}
