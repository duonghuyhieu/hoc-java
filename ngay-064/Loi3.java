// Cố ý sai — chạy để xem lỗi như trong video.
class HetXu extends Exception {}
void mua(int gia) {
  if (gia > 100) throw new HetXu();
  System.out.println("Mua " + gia);
}
void main() {
  mua(150);
}
