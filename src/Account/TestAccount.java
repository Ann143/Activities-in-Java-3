package Account;

public class TestAccount {

    public static void main(String[] args) {
        Name name1 = new Name("Ms.", "Mery-an", "A.", "Telez"); //creates an object of class Name and invoke the constructor Name
        MyDate dateOpened = new MyDate(2, 23, 2020);  //creates an object of MyDate class and invoke the constructor MyDate
        MyDate birthdate = new MyDate(6, 31, 1999);  //creates an object MyDate class and invoke it

        Name name2 = new Name("Mr.", "Allan", "A.", "Teles");
        MyDate dateOpened2 = new MyDate(3, 12, 2020);
        MyDate birthdate2 = new MyDate(5, 18, 1992);

        Name name3 = new Name("Mr.", "Alex", "A.", "Teles");
        MyDate dateOpened3 = new MyDate(5, 28, 2020);
        MyDate birthdate3 = new MyDate(7, 18, 1991);

        MyAccount acc = new MyAccount(1, name1, dateOpened, birthdate, 1000, 1000); //set an arguments to object Account
        MyAccount acc2 = new MyAccount(2, name2, dateOpened2, birthdate2, 5000, 5000);
        MyAccount acc3 = new MyAccount(2, name3, dateOpened3, birthdate3, 10000, 10000);

        acc.DisplayInfo();   //display the information
        acc2.DisplayInfo();
        acc3.DisplayInfo();
    }

}
