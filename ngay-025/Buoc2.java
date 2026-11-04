int tinhCuoc(int km) {
  return km * 12000;
}

void main() {
  int tong = tinhCuoc(3);
  tong = tong + tinhCuoc(5);
  System.out.println(tong);
}
