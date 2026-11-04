class NhanVat {
  private int mau = 100;
  int getMau() { return mau; }
}
void main() {
  var nhanVat = new NhanVat();
  int banChep = nhanVat.getMau();
  banChep = -500;
  System.out.println(nhanVat.getMau());
}
