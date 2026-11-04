int tinhGiam(int tong) {
  if (tong >= 100000)
    return tong * 10 / 100;
  return 0;
}
void main() {
  int tong = 36000 + 60000 + 24000;
  int tra = tong - tinhGiam(tong);
  System.out.println("Trả: " + tra);
}
