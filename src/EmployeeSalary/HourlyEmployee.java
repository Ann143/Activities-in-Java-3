package EmployeeSalary;

import java.util.Date;

public class HourlyEmployee extends Employee {

    private float hoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();

    }


    public HourlyEmployee(float hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, MyName empName, Date dateHired, String type,float hoursWorked, double ratePerHour) {
        super(empID, empName, dateHired, type);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float HoursWorked) {
        this.hoursWorked = HoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    void displayHourLyEmpInfo() {
        super.displayInfo();
        System.out.println("Salary: " + computeSalary() + "\n");
    }

    public double computeSalary() {
        double total = 0;
        double hours;
        double overtime = 0;
        if (hoursWorked <= 40) {
            total = hoursWorked * ratePerHour;
        } else if (hoursWorked > 40) {
            hours = hoursWorked - 40;
            overtime = (hours * ratePerHour) * 1.5;
            total = 40 * ratePerHour + overtime;
        }
        return total;
    }

}
