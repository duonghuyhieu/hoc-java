void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(Integer.valueOf(1));
  System.out.println(tui);
}
