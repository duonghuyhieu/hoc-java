void main() {
  int daNghe = 0;
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) {
      continue;
    }
    daNghe = daNghe + 1;
  }
  System.out.println(daNghe);
}
