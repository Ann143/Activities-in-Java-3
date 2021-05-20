package EmployeeSalary;

import java.util.Date;

public class Employee {

    private int empID;
    private MyName empName;
    private Date dateHired;
    private String type;
    private double salary;
    
    
     public Employee() {
    }

    public Employee(int empID, MyName empName, Date dateHired, String type) {
        this.empID = empID;
        this.empName = empName;
        this.dateHired = dateHired;
        this.type = type;
//        this.salary = salary;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
   
    //setter
    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(MyName empName) {
        this.empName = empName;
    }

    //getter
    public Date getDateHired() {
        return dateHired;
    }

    public int getEmpID() {
        return empID;
    }

    public MyName getEmpName() {
        return empName;
    }

    //displays the employee's info
    public void displayInfo() {
        System.out.println("==============================\nEmployee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Date Hired : " + this.dateHired);
    }

}
