class NhanVat {
  private int mau = 100;
  void hoiMau(int luong) {
    if (luong > 0) mau += luong;
    System.out.println(mau);
  }
}
void main() {
  new NhanVat().hoiMau(-500);
}
