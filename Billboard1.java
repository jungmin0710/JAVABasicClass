/*
정수와 텍스트를 저장하고 관리하는 방법
데이터 형에 따라서 int는 %d(10진수) string은 %s(문자열)로 포매팅한다.
*/

class Main {
  public static void main(String[] args) {
    int rank = 1;
    String song = "Despacito";
    int lastweek = 1;
    String imagesrc = "https://www.billboard.com/images/q123456789";
    String artist = "luis fonsi";
    String sf = String.format(" %d, %s, %d, %s, %s",rank, song, lastweek, imagesrc, artist);
    System.out.println(sf);
  }
}
