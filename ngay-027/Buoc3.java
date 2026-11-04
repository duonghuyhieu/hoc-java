int tienVe(int soVe) {
  return soVe * 120000;
}
int giamGia(int tien) {
  return tien - 20000;
}
void main() {
  int tien = tienVe(2) + 65000;
  System.out.println(giamGia(tien));
}
