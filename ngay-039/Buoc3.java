class Kien {
  int kg;
  Kien(int k) { kg = k; }
  int phiShip() { return kg * 15000; }
}
void main() {
  int tong = new Kien(2).phiShip();
  tong = tong + new Kien(5).phiShip();
  System.out.println(tong);
}
