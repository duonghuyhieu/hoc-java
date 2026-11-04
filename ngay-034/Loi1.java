// Cố ý sai — chạy để xem lỗi như trong video.
int giam(int tong) {
  if (tong >= 100000) {
    return tong * 10 / 100;
  }
}
void main() {
  int tong = 100000;
  System.out.println(tong - giam(tong));
}
