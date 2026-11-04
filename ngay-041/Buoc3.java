class GioHang { int tong = 200000; }
void main() {
  var gio = new GioHang();
  int tien = gio.tong;
  tien -= 30000;
  System.out.println(gio.tong);
  var thamSo = gio;
  thamSo.tong -= 30000;
  System.out.println(gio.tong);
}
