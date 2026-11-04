// Cố ý sai — chạy để xem lỗi như trong video.
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
  int phunLua() { return 90; }
}
void main() {
  Quai dich = new Rong();
  System.out.println(dich.phunLua());
}
