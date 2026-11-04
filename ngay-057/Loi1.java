// Cố ý sai — chạy để xem lỗi như trong video.
void main() {
  String[] ghiBan = {"An", "Huy", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    dem.put(ten, dem.get(ten) + 1);
  }
  System.out.println(dem);
}
