// Cố ý sai — chạy để xem lỗi như trong video.
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  viAn.soDu = 500000;
  var viBinh = viAn;
  viAn.soDu = 0;
  int soLan = 1000000 / viBinh.soDu;
  System.out.println(soLan);
}
