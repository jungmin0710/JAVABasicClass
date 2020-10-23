/*
날짜 표시형식 4가지:FULL/LONG/MEDIUM/SHORT
사용자 정의 형식으로도 가능
*/
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Main {
  public static void main(String[] args) {
    Date today  = new Date();//컴퓨터 시스템 시간 기준으로 현재시간
    System.out.println(today);

    DateFormat format1 = DateFormat.getDateInstance(DateFormat.FULL);
    System.out.println(format1.format(today));
    
    DateFormat format2 = DateFormat.getDateInstance(DateFormat.LONG);
    System.out.println(format2.format(today));
    
    DateFormat format3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    System.out.println(format3.format(today));

    DateFormat format4 = DateFormat.getDateInstance(DateFormat.SHORT);
    System.out.println(format4.format(today));
    //사용자 정의로!
    SimpleDateFormat dateForm1 = new SimpleDateFormat("yyyy년 MM월 dd일");
    System.out.println(dateForm1.format(today));

    SimpleDateFormat dateForm2 = new SimpleDateFormat("MM월 dd일");
    System.out.println(dateForm2.format(today));

    SimpleDateFormat dateForm3 = new SimpleDateFormat("MM월 dd일 hh시 mm분");
    System.out.println(dateForm3.format(today));

    SimpleDateFormat dateForm4 = new SimpleDateFormat("yy-MM-dd");
    System.out.println(dateForm4.format(today));
      
  }
}
