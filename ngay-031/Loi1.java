// Cố ý sai — chạy để xem lỗi như trong video.
void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(10);
  System.out.println(tui);
}
