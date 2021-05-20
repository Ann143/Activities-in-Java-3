package sdjavaenhance;

import EmployeeSalary.*;
import static sdjavaenhance.EmployeeTest.in;

public class EmployeeInput {

    //getting the employee's input by making a method by each info needed
    public int getId(){
        System.out.println("Enter id: ");
        int empId = in.nextInt();
        return empId;
        
    }
    
    
    public String getFname() {
        System.out.print("Enter firstname: ");
        String fname = in.next();
        return fname;
    }

    public String getMname() {

        System.out.print("Enter middlename: ");
        String mname = in.next();
        return mname;
    }

    public static String getLname() {

        System.out.print("Enter lastname: ");
        String lname = in.next();
        return lname;
    }

    public double totalSales() {

        System.out.print("Enter Total Sales: ");
        double totalSales = in.nextDouble();
        return totalSales;
    }

    public float ratePerHour() {

        System.out.print("Enter rate Per Hour: ");
        float totalSales = in.nextFloat();
        return totalSales;
    }

    public float hoursWorked() {

        System.out.print("Enter hours Worked: ");
        float totalSales = in.nextFloat();
        return totalSales;
    }

    public double baseSalary() {

        System.out.print("Enter Base Salary: ");
        double baseSalary = in.nextDouble();
        return baseSalary;
    }

    public int totalPiecesFinished() {

        System.out.print("Enter Total Pieces Finished: ");
        int totalPiecesFinished = in.nextInt();
        return totalPiecesFinished;
    }

    public double ratePerPiece() {
        System.out.print("Enter Rate per piece: ");
        double ratePerPiece = in.nextDouble();
        return ratePerPiece;
    }

}
