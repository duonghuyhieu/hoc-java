record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton > 0) ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
  gio.them("Pate meo", 0);
  System.out.println(gio.ds());
}
