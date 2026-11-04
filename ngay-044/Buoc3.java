class Ve {
  static int daBan = 0;
  Ve() { daBan++; }
}
void main() {
  new Ve();
  new Ve();
  var veCuoi = new Ve();
  System.out.println(veCuoi.daBan);
}
