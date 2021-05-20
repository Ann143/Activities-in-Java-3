package EmployeeSalary;

import java.util.Date;

public class CommissionEmployee extends Employee {

    public double totalSales;//original
    //private double baseSalary;//added

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int empID, MyName empName,Date dateHired, String type, double totalSales) {
        super(empID, empName, dateHired,type);
        this.totalSales = totalSales;

    }

    //GETTER AND SETTER 
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    //calling the displayinfo from the class Employee using the keyword super
    //add the computeSalary
    public void displayComEmpDetails() {
        super.displayInfo();
        System.out.println("Commission Salary: " + computeSalary() + "\n");
    }

    //computing the salary
    public double computeSalary() {
        double total = 0;
        if (totalSales <= 10000) {
            total = totalSales * .10;
        } else if (totalSales > 10000 && totalSales < 100000) {
            total = totalSales * .20;
        } else {
            total = totalSales * .25;
        }
        return total;
    }

}
