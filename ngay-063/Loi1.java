// Cố ý sai — chạy để xem lỗi như trong video.
void main() {
  int gheTrong = 50;
  try {
    gheTrong = gheTrong / 0;
    System.out.println("Đã đặt 2 vé");
  } finally {
    System.out.println("Khóa quầy");
  }
  System.out.println(gheTrong);
}
