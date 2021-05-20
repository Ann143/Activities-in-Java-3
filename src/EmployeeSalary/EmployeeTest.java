package EmployeeSalary;

import java.util.Scanner;

import java.util.Date;

public class EmployeeTest {

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        EmployeeRoster roster=new EmployeeRoster();
        
        HourlyEmployee hrly = new HourlyEmployee(05,new MyName("Mery-an", "A", "Telez"), new Date(),"HE",35,200);
        HourlyEmployee hrly1 = new HourlyEmployee(07,new MyName("Marlon", "A", "Telez"), new Date(),"HE",40,200);
        hrly.setSalary(hrly.computeSalary());
        roster.addEmployee(hrly);
        hrly.setSalary(hrly1.computeSalary());
        roster.addEmployee(hrly1);

        PieceWorkerEmployee piece = new PieceWorkerEmployee(12,new MyName("Junmar","Layaog","Jmola"),new Date(),"PWE",200,50);
        piece.setSalary(piece.computeSalary());
        roster.addEmployee(piece);
        
        CommissionEmployee commission = new CommissionEmployee(13,new MyName("Kerwien","K","Bengil"),new Date(),"CE",10000);
        commission.setSalary(commission.computeSalary());
        roster.addEmployee(commission);
        
        BasePlusCommisionEmployee base = new BasePlusCommisionEmployee(14,new MyName("Rehnan","E.", "Ramil"),new Date(),"BPCE", 300,100);
        base.setSalary(base.computeSalary());
        roster.addEmployee(base);
        
        System.out.println(".........................Employee Data...............................");
        roster.summary();
        
        System.out.println("\n");
        System.out.println("..........Employee Counting...............");
        roster.empCount();
        
        System.out.println("");
                
        
        
        
        
        
//        Employee employee = new Employee();
//        EmployeeInput input = new EmployeeInput();
//        String[] options = {"Add", "Remove", "EXIT"};
//        int choice = 0;
//        int id = 143;
//        EmployeeRoster roster = new EmployeeRoster();
//        do {
//            System.out.println(">>>>>>>>>>>><<<<<<<<<<<<");
//            System.out.println(".....MENU.......");
//            for (int i = 0; i < options.length; ++i) {
//                System.out.printf("[%d.] %s\n", i + 1, options[i]);
//
//            }
//            do {
//
//                System.out.print("Enter your choice: ");
//                choice = in.nextInt();
//                switch (choice) {
//                    case 1:
//                        System.out.println("..............................");
//                        System.out.println(".....ADD EMPLOYEE......");
//                        Employee emp = new Employee();
//                        MyName name = new MyName();
//                        System.out.print("Enter ID: ");
//                        emp.setEmpID(in.nextInt());
//                        System.out.print("Enter firstname: ");
//                        name.setFirstName(in.nextLine());
//                        System.out.print("Enter middle name: ");
//                        name.setMiddleName(in.nextLine());
//                        System.out.print("Enter last name: ");
//                        name.setLastName(in.nextLine());
//                        
//                       // MyName name = new MyName(input.getFname(), input.getMname(), input.getLname());
//                       // Employee emp = new Employee(id, name, new Date());
//                        HourlyEmployee hrly = new HourlyEmployee(id, name, new Date(), input.ratePerHour(), input.hoursWorked());
//                        roster.summary();
//                       
//                        hrly.displayHourLyEmpInfo();
//                        break;
//                    case 2:
//                        System.out.println("..................................");
//                        System.out.println(".....PIECE WORKER EMPLOYEE.....");
//                        PieceWorkerEmployee piece = new PieceWorkerEmployee(id, name, new Date(), input.totalPiecesFinished(), input.ratePerPiece());
//                        piece.displayPieceWorkerSalaryDetails();
//                        break;
//                    default:
//                        System.out.println("Invalid Choice!");
//                }
//
//            } while (!(choice >= 1 && choice <= 5));
//
//        } while (choice != 5);
//
   }

}
