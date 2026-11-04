abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  int tong = 100000;
  tong += new The().phi(tong);
}
