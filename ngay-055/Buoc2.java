interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
class ViDienTu implements ThanhToan {
  public int phi() { return 1000; } }
void main() {
  ThanhToan cachTra = new The();
  cachTra = new ViDienTu();
  System.out.println(cachTra.phi());
}
