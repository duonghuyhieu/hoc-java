class GioHang { int tong = 200000; }
void giam(GioHang gio) {
  gio = new GioHang();
  gio.tong -= 30000;
}
void main() {
  var gio = new GioHang();
  giam(gio);
  System.out.println(gio.tong);
}
