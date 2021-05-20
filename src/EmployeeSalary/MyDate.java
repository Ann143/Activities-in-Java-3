/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeSalary;

/**
 *
 * @author Admin
 */

public class MyDate {

    private int date;
    private int month;/*0-january;11-december*/
    private int year;
    private static final String[] monthName = {"JANUARY", "FEBUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

    //create your constructors and overload them
    public MyDate() {

    }

    public MyDate(int Month, int Date, int Year) {
        this.date = Date;
        this.month = Month;
        this.year = Year;
    }

    //create your necessary setters and getters
    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //getter
    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static String[] getMonthName() {
        return monthName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(monthName[month]);
        sb.append("/");
        sb.append(date);
        sb.append("/");
        sb.append(year);
        sb.append("/");

        return sb.toString();
    }
}
