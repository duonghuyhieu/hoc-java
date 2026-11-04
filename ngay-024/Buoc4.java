void main() {
  int[] cacDon = {20, 0, 35, 50};
  int mau = 50;
  for (int don : cacDon) {
    if (don == 0) continue;
    mau = mau - don;
    if (mau <= 0) continue;
  }
  System.out.println(mau);
}
