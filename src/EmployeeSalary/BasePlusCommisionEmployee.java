package EmployeeSalary;

import java.util.Date;

public class BasePlusCommisionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommisionEmployee() {
        super();
    }

    public BasePlusCommisionEmployee(int empID, MyName empName, Date dateHired,String type, double totalSales, double baseSalary) {
        super(empID, empName, dateHired, type,totalSales);
        this.baseSalary = baseSalary;

    }

    public BasePlusCommisionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //setter
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //calling the displayinfo from employee by the keyword super
    //and add the computeSalary
    void displayBaseComEmployeeDetails() {
        super.displayInfo();
        System.out.println("Base Plus Commission Salary: " + computeSalary() + "\n");
    }

    public double computeSalary() {
        return baseSalary + super.computeSalary();
    }
}
