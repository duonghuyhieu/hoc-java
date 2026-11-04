// Cố ý sai — chạy để xem lỗi như trong video.
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  gia = Collections.sort(gia);
  gia.sort(Comparator.reverseOrder());
  System.out.println(gia);
}
