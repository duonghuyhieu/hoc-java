void main() {
  int[] gia = {15000, 10000, 20000};
  int[] soLuong = {2, 1, 3};
  int tong = 0;
  for (int i = 0; i < gia.length; i++) {
    tong += gia[i] * soLuong[i];
  }
  System.out.println(tong);
}
