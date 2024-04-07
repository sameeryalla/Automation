package com.javapractice.pojojavabean;

public class Program1 {
    public static void main(String[] args) {

        Employee e1=new Employee();
        e1.setID(1600802);
        e1.empName="Sameer Yalla1";
        e1.empSal=110567.55;

        Employee e2=new Employee();
        e2.setID(1600801);
        e2.empName="Sameer Yalla2";
        e2.empSal=50567.55;

        Employee e3=new Employee();
        e3.setID(1600803);
        e3.empName="Swarupa Yalla";
        e3.empSal=10567.55;

        Employee[] employees=new Employee[] {e1,e2,e3};

        System.out.println(e1.getID());
        System.out.println(e1.empName);
        System.out.println(e1.empSal);

        int empCount=employees.length;
        System.out.println("Total Employees: "+empCount);
        double totalSal=0;
        for (int i=0; i<empCount;i++)
        {
            totalSal=totalSal+employees[i].empSal;
        }
        System.out.println("Employess Total salary is "+totalSal);
    }
}
