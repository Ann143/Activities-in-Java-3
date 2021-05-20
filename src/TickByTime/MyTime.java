
package TickByTime;

public class MyTime {

   private int hour;
   private int minute;
   private int second;
   private int meridian; // 0 as AM , 1 as NOON, 2 as PM, 3 as MIDNIGHT
 
   
 
  public MyTime(){
      hour = 12;
      minute = 0;
      second = 0;
      meridian = 1;
  }
   
   public MyTime(int hour, int minute, int second){
      this.setHour(hour);
      this.setMinute(minute);
      this.setSecond(second);
  }
 
 

  //setters
 
  public void setHour(int hour){
      this.hour = hour<24 && hour >=0 ? hour : 0;
  }
 
  public void setMinute(int minute) {
      this.minute = minute<60 && minute >=0 ? minute : 0;
  }

  public void setSecond(int second) {
      this.second = second<60 && second >=0 ? second : 0;
  }

  public void setMeridian(int meridian) {
      this.meridian = meridian;
  }
//getter
 
  public int getMinute() {
      return minute;
  }
   public int getHour(){
      return hour;
   }
  public int getSecond() {
      return second;
  }
   public int getMeridian() {
      return meridian;
  }
 
   public MyTime(int hour, int minute, int second, int meridian ){
   this.minute = minute;
   this.hour = hour;
   this.second = second;
   this.meridian = meridian;
   
   
}
 
 
  public void displayTime24(){
      System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
  }
  public void tickBySecond(int second){
      this.second=second;
      if(this.second>59){
          this.second=0;
          tickByMinute();
      }
  }
  public void tickBySecond(){
      this.second++;
      if(this.second>59){
          this.second=0;
          tickByMinute();
      }
  }

  public void tickByMinute(){
       minute++;
      if(this.minute>59){
          this.minute=0;
     
          this.minute = 0;
          tickByHour();
      }
  }
  public void tickByHour(){
      this.hour++;
      if(this.hour>24){
          System.out.println("Hour");
          this.hour=0;
      }
  }

  @Override
  public String toString() {
      return String.format("%02d:%02d:%02d\n", hour, minute, second); //To change body of generated methods, choose Tools | Templates.
  }
}
