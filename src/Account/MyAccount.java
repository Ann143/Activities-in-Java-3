package Account;

public class MyAccount {

    private int accNum;
    private Name accName;
    private MyDate accDateOpened;
    private MyDate birthDate;
    private double currentBalance;
    private double totalBalance;

    //constructor
    public MyAccount() {

    }

    public MyAccount(int accnum, Name accname, MyDate accdateOpened, MyDate birthdate, double currentbalance, double totalbalance) {
        this.accNum = accnum;
        this.accName = accname;
        this.accDateOpened = accdateOpened;
        this.birthDate = birthdate;
        this.currentBalance = currentbalance;
        this.totalBalance = totalbalance;
    }

    //setter
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccName(Name accName) {
        this.accName = accName;
    }

    public void setAccDateOpened(MyDate accDateOpened) {
        this.accDateOpened = accDateOpened;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    //getter
    public int getAccNum() {
        return accNum;
    }

    public Name getAccName() {
        return accName;
    }

    public MyDate getAccDateOpened() {
        return accDateOpened;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    //display both the current and total balance
    public void checkBalance() {
        System.out.println("");

    }
    //Amount to be withdrawn should be a multiple of 100 and it must not exceed
    //your current balance

    public void withdraw(double amount) {
        if (amount < currentBalance) {
            if (amount % 100 == 0) {
                totalBalance -= amount;
                currentBalance -= amount;
            } else {
                System.out.println("Amount to be withdrawn should be a multiple of 100.");
            }
        } else {
            System.out.println("You cannot withdraw!");
        }

//       return true;
    }
    //add amount to the total balance but not on the current balance

    public boolean deposit(double amount) {
        currentBalance += totalBalance;
        return true;
    }

    public boolean transfer(MyAccount other, double amount) {
        other.currentBalance += amount;
        other.totalBalance += amount;

        totalBalance -= amount;
        currentBalance -= amount;

        return true;
    }

    /**
     * overrride toString() POSSIBLE OUTPUT: Account Number :1001 Account Name
     * :Edrian B. Guanzon Date Opened: MAR-01-2021 Birth Date:FEB-16-2000
     * Current Balance:Php 75 000.00 Total Balance:Php 75 000.00
     */
    public void DisplayInfo() {
        System.out.println("..............................");
        System.out.println("Account #: " + accNum);
        System.out.println("Account Name: " + accName);
        System.out.println("Date Opened: " + accDateOpened);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Total Balance: " + totalBalance);
    }

}
