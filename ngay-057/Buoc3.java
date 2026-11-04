void main() {
  String[] ghiBan = {"An", "Vũ", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    dem.merge(ten, 1, Integer::sum);
  }
  System.out.println(dem);
}
