void main() {
  int[] gia = {15000, 25000, 10000};
  int[] soLuong = {2, 1, 3};
  int tong = 0;
  for (int i = 0; i < gia.length; i++) {
    tong = tong + gia[i] * soLuong[i];
  }
  System.out.println(tong);
}
