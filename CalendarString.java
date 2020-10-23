import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


class Main {
  public static Calendar todate(String ss) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date dd = new Date();
    try {
      dd = sdf.parse(ss);
    }catch(ParseException e){

    }
    Calendar cal = Calendar.getInstance();
    cal.setTime(dd);
    return cal;
  }

  public static String toYMD(Calendar dd) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(dd.getTime());
  }

  public static void main(String[] args) {
    String st = "2017-06-13";// 날짜 형태가 년-월-일 형식
    //simpleDateFormat을 이용해서 Calendar로 변화할 수 있다.
    Calendar d2 = todate(st);//날짜로 변환
    System.out.println(toYMD(d2));
  }
}
