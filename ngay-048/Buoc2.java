class Khach { int bot() { return 5; } }
class Vip extends Khach {
  @Override
  int bot() { return 15; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
