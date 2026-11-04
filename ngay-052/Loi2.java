// Cố ý sai — chạy để xem lỗi như trong video.
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
  int tip() { return 5000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.tip());
}
