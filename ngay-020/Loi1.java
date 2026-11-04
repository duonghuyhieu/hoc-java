// Cố ý sai — chạy để xem lỗi như trong video.
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) {
      continue;
      System.out.println("Bỏ bài 3");
    }
    System.out.println(bai);
  }
}
