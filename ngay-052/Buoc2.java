interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  int tong = nguoiGiao.phi();
  tong = tong + nguoiGiao.phi();
  System.out.println(tong);
}
