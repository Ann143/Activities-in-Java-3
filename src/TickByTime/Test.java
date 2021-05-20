
package TickByTime;


public class Test {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        MyTime t2 = new MyTime(12, 40, 59);
        
        
        t2.tickBySecond();
        t2.displayTime24(); 
        
       t2.tickBySecond(); 
        t2.displayTime24();
        
       t2.tickBySecond(); 
        t2.displayTime24();
    }
}
