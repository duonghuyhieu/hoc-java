// Cố ý sai — chạy để xem lỗi như trong video.
interface ThanhToan { int phi(); }
class TienMat implements ThanhToan {
  public int Phi() { return 0; } }
void main() {
  ThanhToan cachTra = new TienMat();
  System.out.println(cachTra.phi());
}
