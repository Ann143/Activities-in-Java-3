package EmployeeSalary;

import java.util.Date;

public class PieceWorkerEmployee extends Employee {

    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, MyName empName, Date dateHired,String type, int totalPiecesFinished, double ratePerPiece) {
        super(empID,empName,dateHired,type);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    //setter and getter
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    //calling the displayinfo from employee class using the keyword super
    //adding the computeSalary in displaying the Information
    void displayPieceWorkerSalaryDetails() {
        super.displayInfo();
        System.out.println("PieceWork Salary: " + computeSalary() + "\n");
    }

    //computing the salary
    public double computeSalary() {
        double temp;
        double total = 0;
        double bonus = 0;
        if (totalPiecesFinished >= 100) {
            if (totalPiecesFinished % 100 == 0) {
                bonus = (totalPiecesFinished / 100) * 10;
                temp = ratePerPiece * bonus;
                total = (totalPiecesFinished * ratePerPiece) + temp;
            }
        } else {
            bonus = totalPiecesFinished * ratePerPiece;
            total = bonus;
        }
        return total;
    }

}
