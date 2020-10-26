///main

/*
Data를 객체로 저장하자
객체로 찍어낼 때는 int형이 String으로 취급되어 반환된다.

*/

class Main { 

  public static void showAbout(Billbaord bb){
    String sf = String.format("%s, %s, %s, %s, %s",bb.getRank(), bb.getSong, bb.getLastweek(), bb.getImage(),bb.getArtist);
  }

  public static void main(String[] args) {

    //Data객체로 저장
    Billbaord b1 = new Billbaord(1, "Despacito", 1, "http://www.billboard.com/images/q4456644232.jpg","luis Fonsi");

    showAbout(b1); //객체로 전달

    Billbaord b = b1;//주소 복사
    showAbout(b); //객체 내용을 출력
  }

}



/////Billbaord Class(따로)
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

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
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
