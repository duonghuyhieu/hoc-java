// Cố ý sai — chạy để xem lỗi như trong video.
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  ao.gia = 0;
  System.out.println(ao.gia());
}
