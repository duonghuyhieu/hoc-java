interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
class TienMat implements ThanhToan {
  public int phi() { return 0; } }
void main() {
  ThanhToan cachTra = new The();
  cachTra = new TienMat();
  System.out.println(cachTra.phi());
}
