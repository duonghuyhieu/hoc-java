class Khach { int bot() { return 7; } }
class Vip extends Khach {
  @Override
  int bot() { return super.bot() + 10; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
