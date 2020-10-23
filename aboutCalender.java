/*

*/
import java.util.Calendar;
import java.util.Date;



class Main {
  public static void printCalendar(Calendar c){
    System.out.println(c.get(Calendar.YEAR));
    System.out.println(c.get(Calendar.MONTH)+1);//MONTH만 0에서 시작해서 +1을 더해줘야 함
    System.out.println(c.get(Calendar.DAY_OF_MONTH));
    System.out.println(c.get(Calendar.AM_PM));
    System.out.println(c.get(Calendar.HOUR_OF_DAY));
    System.out.println(c.get(Calendar.MINUTE));
    System.out.println(c.get(Calendar.SECOND));
  }


  public static void main(String[] args) {
    // Date d = new Date();
    // System.out.println(d);
    // Calendar today = Calendar.getInstance();
    // System.out.println(today);

    Calendar today = Calendar.getInstance();
    printCalendar(today);
  }
}
