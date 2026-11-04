class Ve {
  static int daBan = 0;
  int ma;
  Ve() { daBan++; ma = daBan; }
}
void main() {
  int maVe = new Ve().ma;
  maVe = new Ve().ma;
  System.out.println(Ve.daBan);
}
