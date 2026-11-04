void main() {
  int soDu = 50000;
  int gia = 45000;
  boolean duTien = soDu >= gia;
  soDu = soDu - gia;
  System.out.println(duTien);
  duTien = soDu >= gia;
  System.out.println(duTien);
}
