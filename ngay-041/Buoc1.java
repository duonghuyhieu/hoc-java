class GioHang { int tong = 200000; }
void giam(int tong) { tong -= 30000; }
void main() {
  var gio = new GioHang();
  giam(gio.tong);
  System.out.println(gio.tong);
}
