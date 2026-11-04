int giamGia(int tong) {
  return tong * 10 / 100;
}
void main() {
  int tong = 85000;
  int giam = giamGia(tong);
  System.out.println(tong - giam);
}
