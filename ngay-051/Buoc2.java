abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  ThanhToan the = new The();
  System.out.println(the.phi(100000));
}
