// Cố ý sai — chạy để xem lỗi như trong video.
class Khach {
  String ten;
  Khach(String ten) { this.ten = ten; }
}
class Vip extends Khach {
}
void main() {
  System.out.println(new Vip().ten);
}
