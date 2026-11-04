void main() {
  String[] ghiBan = {"An", "Huy", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    int cu = dem.getOrDefault(ten, 0);
    dem.put(ten, cu + 1);
  }
  System.out.println(dem);
}
