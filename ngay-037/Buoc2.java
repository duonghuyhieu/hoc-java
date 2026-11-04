void main() {
  NhanVat hiepSi = new NhanVat();
  NhanVat rong = new NhanVat();
  hiepSi.mau = 70;
  int mauRong = rong.mau;
  System.out.println(mauRong);
}
class NhanVat {
  int mau = 100;
}
