// Cố ý sai — chạy để xem lỗi như trong video.
class Bai {
  String ten = "Ngày mưa";
  public boolean equals(Object o) {
    return ten.equals(((Bai) o).ten);
  }
}
void main() {
  Bai daCo = new Bai(), moi = new Bai();
  System.out.println(daCo.equals(null));
}
