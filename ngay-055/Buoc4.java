interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; }
}
void main() {
  int tongTien = 250000;
  ThanhToan cachTra = new The();
  tongTien = tongTien + cachTra.phi();
  System.out.println(tongTien);
}
