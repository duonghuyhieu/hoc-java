// Cố ý sai — chạy để xem lỗi như trong video.
void main() {
  var gia =
    new HashMap<String, Integer>();
  gia.put("Kiếm", 300);
  gia.put("Khiên", 200);
  gia.put("Kiếm", 500);
  int tong = gia.get("Kiếm");
  tong = tong + gia.get("Rìu");
  System.out.println(tong);
}
