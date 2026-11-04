// Cố ý sai — chạy để xem lỗi như trong video.
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  @Override String Chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
