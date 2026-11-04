interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
void main() {
  ThanhToan cachTra = new The();
  System.out.println(cachTra.phi());
}
