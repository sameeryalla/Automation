package com.javapractice.pojojavabean;

public class Employee {
    private int empId;
    public String empName;
    protected Double empSal;


    public Employee()
    {
        System.out.println("No Args Constructor called");
    }
    public Employee(int empId)
    {
        this.empId=empId;
    }
    public void setID(int empId){
        this.empId=empId;
    }

    public int getID()
    {
        return empId;
    }
}
