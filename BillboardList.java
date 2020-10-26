////Main Class

import java.util.ArrayList;

class Main {
  public static void showAbout(Billbaord bb) {//하나하나씩 정보를 저장하기 번거롭기 때문에 객체로 정보를 저장하는 게 간편하다.
    String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), bb.getImagesrc(), bb.getArtist());
  }

  public static void main(String[] args) {
    ArrayList<Billbaord> bills = new ArrayList<Billbaord>();

    bills.add(new Billbaord(1,"Despacito", 1, "http://www.billboard.com/image/q8746644125.jpg", "Luis fonsi"));
    bills.add(new Billbaord(2,"I love you", 2, "http://www.billboard.com/image/q871384125.jpg", "Bruno Mars"));
    bills.add(new Billbaord(3,"Holy, Moly", 3, "http://www.billboard.com/image/q123456789.jpg", "BTS"));

    System.out.println(bills.size());
    System.out.println(bills.get(0));
    showAbout(bills.get(0));

    bills.remove(0);//제일앞을 지워서 인덱스의 순서가 앞으로 하나씩 밀린다.
    System.out.println(bills.size());
    System.out.println(bills.get(0));
    showAbout(bills.get(0));
    
  }
}





////Billbaord Class(따로 만들기)

import java.io.Serializable;//인터페이스 상속(인터페이스 => 설계도개념)
//Serializable => 직렬화 인터페이스

public class Billbaord implements Serializable {
  private int rank; // 순위
  private String song; // 노래 제목
  private int lastweek; // 지난주 등수
  private String imagesrc; // 사진 정보
  private String artistsrc; // 가수 사진
  private String artist; // 가수이름

  //생성자
  //빈것
  public Billbaord() {}

  //6개 인수일 때는 이곳으로
  public Billbaord(int rank, String song, int lastweek, String imagesrc, String artistsrc, String artist){
    super();
    this.rank = rank;
    this.song = song;
    this.lastweek = lastweek;
    this.imagesrc = imagesrc;
    this.artistsrc = artistsrc;
    this.artist = artist;
  }

  //5개 인수일 때는 이곳으로
  public Billbaord(int rank, String song, int lastweek, String imagesrc, String artist){
    super();
    this.rank = rank;
    this.song = song;
    this.lastweek = lastweek;
    this.imagesrc = imagesrc;
    this.artist = artist;
  }

  @Override //단순한 표시(but 컴퓨터도 인식하는 주석 : 어노테이션)
  public String toString() {
    return "[rank = " + rank + ", song = " + song + ", lastweek = " + lastweek + ", imagesrc = " + imagesrc + ", artist = " + artist + "]";
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public String getSong() {
    return song;
  }

  public void setSong(String song) {
    this.song = song;
  }

  public int getLastweek() {
    return lastweek;
  }

  public void setLastweek(int lastweek) {
    this.lastweek = lastweek;
  }

  public String getImagesrc() {
    return imagesrc;
  }

  public void setImagesrc(String imagesrc) {
    this.imagesrc = imagesrc;
  }

  public String getArtistsrc() {
    return artistsrc;
  }

  public void setArtistsrc(String artistsrc) {
    this.artistsrc = artistsrc;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

}
