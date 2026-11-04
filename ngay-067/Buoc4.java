record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong * 90 / 100);
}
