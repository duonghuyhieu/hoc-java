// Cố ý sai — chạy để xem lỗi như trong video.
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton == 0)
      throw new Exception("Het hang");
    ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
}
