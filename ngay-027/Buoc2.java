int tienVe(int soVe) {
  return soVe * 120000;
}
void main() {
  int tien = tienVe(2) + 65000;
  tien = tien - 20000;
  System.out.println(tien);
}
