record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  var toi = new Cuoc("Hồ Tây", 90000);
  System.out.println(sang == toi);
  System.out.println(sang.equals(toi));
  System.out.println(toi.gia());
}
