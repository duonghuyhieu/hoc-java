// Cố ý sai — chạy để xem lỗi như trong video.
class Khach { int bot() { return 7; } }
class Vip extends Khach {
  @Override
  int bto() { return super.bot() + 10; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
