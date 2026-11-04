// Cố ý sai — chạy để xem lỗi như trong video.
interface Goi {
  default String goi() { return "Alo"; }
}
interface Chup { String chup(); }
class May implements Goi, Chup {
  String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().goi());
}
